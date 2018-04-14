package com.helloalexa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

@RestController
public class AlexaServer {

    private final static String NEXT_SLIDE = "NextSlide";
    private final static String PREVIOUS_SLIDE = "PreviousSlide";
    private final static String GO_TO_SLIDE = "GoToSlide";

    @RequestMapping(value = "/alexa",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String alexa(InputStream input) {
        AlexaRequestModel alexaInput = AlexaRequestParser.parseAlexaRequest(input);
        if (alexaInput.getRequest().getType().equals("IntentRequest")) {
            if (alexaInput.getRequest().getIntent().getName().equals(NEXT_SLIDE)) {
                return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Here is your next slide\"},\"shouldEndSession\": true }}";
            } else if (alexaInput.getRequest().getIntent().getName().equals(PREVIOUS_SLIDE)) {
                return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Here is your previous slide\"},\"shouldEndSession\": true }}";
            } else if (alexaInput.getRequest().getIntent().getName().equals(GO_TO_SLIDE)) {
                return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Here is your go to slide\"},\"shouldEndSession\": true }}";
            }
        }
        return "{\"version\": \"1.0\",\"response\": {\"outputSpeech\": {\"type\": \"PlainText\",\"text\": \"Sorry I did not get that\"},\"shouldEndSession\": true }}";
    }
}
