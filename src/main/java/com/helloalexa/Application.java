package com.helloalexa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                AlexaWebSocketServer.getInstance().startWebSocketServer();
            }
        }).start();


        SpringApplication.run(Application.class, args);
    }
}
