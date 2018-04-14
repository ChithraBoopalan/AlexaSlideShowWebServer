package com.helloalexa;

import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class AlexaRequestParser {
    public static AlexaRequestModel parseAlexaRequest(InputStream alexaInput) {
        String alexaRequestString = null;
        try {
            alexaRequestString = IOUtils.toString(alexaInput, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(alexaRequestString, AlexaRequestModel.class);
    }
}
