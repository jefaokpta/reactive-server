package com.example.websocket.handler

import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession

class EchoHandler: WebSocketHandler {

    override fun handle(session: WebSocketSession) = session.send(session.receive()
            .doFirst { println("CONECTOU ID: " + session.id) }
            .map { "SERVIDOR RECEBEU ${it.payloadAsText}" }
            .doFinally { println("FOI EMBORA ID: " + session.id) }
            .map(session::textMessage))

}