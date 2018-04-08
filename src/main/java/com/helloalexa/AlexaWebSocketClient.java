package com.helloalexa;

import fr.bmartel.protocol.websocket.client.IWebsocketClientChannel;
import fr.bmartel.protocol.websocket.client.IWebsocketClientEventListener;
import fr.bmartel.protocol.websocket.client.WebsocketClient;

public class AlexaWebSocketClient {
    public static void main(String[] args) {
        WebsocketClient clientSocket = new WebsocketClient("localhost", 8000);

        clientSocket.addClientSocketEventListener(new IWebsocketClientEventListener() {

            public void onSocketConnected() {
                System.out.println("[CLIENT] Websocket client successfully connected");
            }

            public void onSocketClosed() {
                System.out.println("[CLIENT] Websocket client disconnected");
            }

            public void onIncomingMessageReceived(byte[] data, IWebsocketClientChannel channel) {
                System.out.println("[CLIENT] Received message from server : " + new String(data));
            }
        });

        clientSocket.connect();
    }
}
