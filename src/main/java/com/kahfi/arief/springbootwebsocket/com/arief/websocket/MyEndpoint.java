package com.kahfi.arief.springbootwebsocket.com.arief.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;


@Component
public class MyEndpoint extends TextWebSocketHandler{


    private static Set<WebSocketSession> sessionList = Collections.synchronizedSet(new HashSet<>());


    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        for(WebSocketSession webSocketSession : sessionList){
            if(webSocketSession.isOpen()){
               if(message.getPayload().equals("insert")){
                   webSocketSession.sendMessage(new TextMessage("load"));
               }
            }
        }
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessionList.add(session);
    }



}
