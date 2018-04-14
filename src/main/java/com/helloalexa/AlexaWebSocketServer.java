package com.helloalexa;

import fr.bmartel.protocol.websocket.listeners.IClientEventListener;
import fr.bmartel.protocol.websocket.server.IWebsocketClient;
import fr.bmartel.protocol.websocket.server.WebsocketServer;

public class AlexaWebSocketServer {
    public static void main(String[] args) {
        WebsocketServer server = new WebsocketServer(8000);

        server.addServerEventListener(new IClientEventListener() {

            public void onMessageReceivedFromClient(IWebsocketClient client,
                                                    String message) {
                //all your message received from websocket client will be here
                System.out.println("message received : " + message);
            }

            public void onClientConnection(IWebsocketClient client) {
                // when a websocket client connect. This will be called (you can store client object)
                System.out.println("Websocket client has connected");

                client.sendMessage("Hello,I'm a websocket server");

                //client.close(); // this would close the client connection
            }

            public void onClientClose(IWebsocketClient client) {
                // when a websocket client connection close. This will be called (you can dismiss client object)
                System.out.println("Websocket client has disconnected");
            }
        });

        server.start();
    }

    public static void sendDataToClient() {

    }
}