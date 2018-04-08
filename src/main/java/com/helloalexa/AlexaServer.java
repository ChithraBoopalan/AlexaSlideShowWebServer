package com.helloalexa;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlexaServer {

    @RequestMapping("/helloAlexa")
    public String helloAlexa() {
        return "hello there!";
    }

    @RequestMapping(value = "/alexa",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String alexa(@RequestBody String input) {
        System.out.println(input);
        return "";
    }
}
