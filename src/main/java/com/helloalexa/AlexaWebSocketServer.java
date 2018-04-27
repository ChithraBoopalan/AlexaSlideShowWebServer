package com.helloalexa;

import com.google.gson.Gson;
import fr.bmartel.protocol.websocket.listeners.IClientEventListener;
import fr.bmartel.protocol.websocket.server.IWebsocketClient;
import fr.bmartel.protocol.websocket.server.WebsocketServer;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AlexaWebSocketServer {

    private static AlexaWebSocketServer instance;
    private Random rand = new Random();
    private ConcurrentMap<Integer, IWebsocketClient> mapToClient = new ConcurrentHashMap<>();
    private ConcurrentMap<IWebsocketClient, Integer> mapToConnectionId = new ConcurrentHashMap<>();
    private Gson gson = new Gson();


    public static synchronized AlexaWebSocketServer getInstance() {
        if(instance == null){
            instance = new AlexaWebSocketServer();
        }
        return instance;
    }

    public void startWebSocketServer() {

        WebsocketServer server = new WebsocketServer(8000);

        server.addServerEventListener(new IClientEventListener() {
            public void onMessageReceivedFromClient(IWebsocketClient client, String message) {

            }

            public void onClientConnection(IWebsocketClient client) {
                int connectionId = rand.nextInt((9999 - 1000) + 1) + 1000;
                mapToClient.put(connectionId, client);
                mapToConnectionId.put(client, connectionId);

                SlideShowRequest request = new SlideShowRequest();
                request.setAction("connected");
                request.setConnection(connectionId);
                client.sendMessage(gson.toJson(request));
            }

            public void onClientClose(IWebsocketClient client) {
                Integer connectionId = mapToConnectionId.remove(client);
                mapToClient.remove(connectionId);
            }
        });

        server.start();
    }

    public void sendDataToClient(int connectionId, SlideShowRequest request) {
        mapToClient.get(connectionId).sendMessage(gson.toJson(request));
    }
}