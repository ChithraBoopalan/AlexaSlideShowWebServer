package com.helloalexa;

import com.amazon.speech.speechlet.authentication.SpeechletRequestSignatureVerifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static java.lang.Math.abs;

@RestController
public class AlexaServer {
    private final static long maxRequestDateToleranceMillis = 150 * 1000;

    private final static String LAUNCH_REQUEST = "LaunchRequest";

    // Built-in Intents
    private final static String STOP_INTENT = "AMAZON.StopIntent";
    private final static String CANCEL_INTENT = "AMAZON.CancelIntent";
    private final static String HELP_INTENT = "AMAZON.HelpIntent";

    private final static String START_SLIDE = "StartSlide";
    private final static String NEXT_SLIDE = "NextSlide";
    private final static String PREVIOUS_SLIDE = "PreviousSlide";
    private final static String GO_TO_SLIDE = "GoToSlide";
    private final static String SEARCH_SLIDE = "SearchSlide";
    private final static String MARK_SLIDE = "MarkSlide";
    private final static String MARKED_SLIDE = "MarkedSlide";

    private static final String HELP_SSML =
            "<speak>" +
            "    <p>" +
            "        Welcome to Slide Show! I'll help you control your reveal dot <say-as interpret-as=\"spell-out\">JS</say-as> slideshows with just your voice." +
            "    </p>" +
            "    <p>" +
            "        Before using this skill, please install the Alexa Slide Show extension on Google Chrome and open a reveal dot <say-as interpret-as=\"spell-out\">JS</say-as> slideshow in the browser. Then click on the extension's icon to see instructions to connect your slideshow to your Alexa device." +
            "    </p>" +
            "    <p>" +
            "        <s>" +
            "            Once connected, you can use voice commands such as" +
            "            <break strength=\"medium\" />next slide<break strength=\"medium\"/>" +
            "            <break strength=\"medium\" />previous slide<break strength=\"medium\"/> and" +
            "            <break strength=\"medium\" />go to slide five<break strength=\"medium\"/>.</s>" +
            "" +
            "        <s>Additionally, you can say <break strength=\"medium\" />mark current slide<break strength=\"medium\"/> to mark a slide and later saying <break strength=\"medium\" />marked slide<break strength=\"medium\"/> will go back to that slide.</s>" +
            "" +
            "        <s>You can also go to a slide by a search string.</s><s>For example, say <break strength=\"medium\" />search planet earth<break strength=\"medium\"/> to go to the slide containing the phrase \"planet earth\".</s>" +
            "    </p>" +
            "" +
            "    Easy, isn't it?" +
            "    <break strength=\"medium\"/>" +
            "    Let's begin! What would you like me to do?" +
            "</speak>";

    private ConcurrentMap<String, Integer> mapToConnectionId = new ConcurrentHashMap<>();

    @RequestMapping(value = "/alexa",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String processAlexaInput(
            InputStream input,
            @RequestHeader(value="Content-Length") Integer contentLength,
            // These headers are mandatory https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-a-web-service.html#verifying-that-the-request-was-sent-by-alexa
            @RequestHeader(value="Signature") String signature,
            @RequestHeader(value="SignatureCertChainUrl") String signatureCertChainUrl,
            HttpServletResponse response
    ) {
        byte[] alexaInputBytes = new byte[contentLength];
        try {
            input.read(alexaInputBytes);
        } catch (IOException e) {
            return "{\"error\": \"Failed to read input\"}";
        }

        // validate the signature
        SpeechletRequestSignatureVerifier.checkRequestSignature(alexaInputBytes, signature, signatureCertChainUrl);

        AlexaRequestModel alexaInput = AlexaRequestParser.parseAlexaRequest(new ByteArrayInputStream(alexaInputBytes));

        Date requestDate = Date.from(Instant.parse(alexaInput.getRequest().getTimestamp()));
        if (abs(new Date().getTime() - requestDate.getTime()) > maxRequestDateToleranceMillis) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }

        if (alexaInput.getRequest().getType().equals(LAUNCH_REQUEST)) {
            return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Hello if you would like to start a new presentation, please say start slide and the unique code\"},\"shouldEndSession\": true }}";
        } else if (alexaInput.getRequest().getType().equals("IntentRequest")) {
            if (alexaInput.getRequest().getIntent().getName().equals(START_SLIDE)) {
                mapToConnectionId.put(getDeviceId(alexaInput), getSlotValue(alexaInput));
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("dismissDialog");
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"All done, I'm ready with your slides\"},\"shouldEndSession\": true }}";
            } else if (alexaInput.getRequest().getIntent().getName().equals(NEXT_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("next");
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(PREVIOUS_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("previous");
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(GO_TO_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("goto");
                request.setSlideNumber(getSlotValue(alexaInput));
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(SEARCH_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("search");
                request.setSearchQuery(alexaInput.getRequest().getIntent().getSlots().getSearch().getValue());
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(MARK_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("mark");
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(MARKED_SLIDE)) {
                SlideShowRequest request = new SlideShowRequest();
                request.setAction("gotoMark");
                AlexaWebSocketServer.getInstance().sendDataToClient(mapToConnectionId.get(getDeviceId(alexaInput)), request);
                return getOutputSpeech();
            } else if (alexaInput.getRequest().getIntent().getName().equals(STOP_INTENT)) {
                return "{\"version\": \"1.0\",\"response\": {\"shouldEndSession\": true }}";
            } else if (alexaInput.getRequest().getIntent().getName().equals(CANCEL_INTENT)) {
                return "{\"version\": \"1.0\",\"response\": {\"shouldEndSession\": true }}";
            } else if (alexaInput.getRequest().getIntent().getName().equals(HELP_INTENT)) {
                String res = "{\"version\": \"1.0\",\"response\": {\"outputSpeech\":{\"type\": \"SSML\", \"ssml\": \"" + HELP_SSML.replace("\"", "\\\"") + "\"}, \"shouldEndSession\": false }}";
                return res;
            }

        }
        return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Sorry I did not get that\"},\"shouldEndSession\": true }}";
    }

    private String getDeviceId(AlexaRequestModel alexaInput) {
        return alexaInput.getContext().getSystem().getDevice().getDeviceId();
    }

    private int getSlotValue(AlexaRequestModel alexaInput) {
        return Integer.parseInt(alexaInput.getRequest().getIntent().getSlots().getNumber().getValue());
    }

    private String getOutputSpeech() {
        return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"SSML\",\"ssml\": \"<speak><audio src='https://s3.amazonaws.com/ask-soundlibrary/musical/amzn_sfx_electronic_beep_01.mp3'/></speak>\"},\"shouldEndSession\": true }}";
    }
}
