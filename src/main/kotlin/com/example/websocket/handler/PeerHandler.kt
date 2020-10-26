package com.example.websocket.handler

import com.example.websocket.model.Central
import org.springframework.stereotype.Service
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono
import java.util.function.Consumer

@Service
class PeerHandler: WebSocketHandler {

    override fun handle(session: WebSocketSession) = session.send(session.receive()
            .doFirst {
                Central.sessions.add(session)
                println("PEER ID: " + session.id)
            }
            .map {"PEER RECEBEU ${it.payloadAsText} LISTA ${Central.sessions.size}"}
            .map(session::textMessage))
            .doFinally {
                Central.sessions.remove(session)
                println("PEER FOI EMBORA ID: " + session.id)
            }

    fun sendMessage(msg: String) {
        Central.sessions.forEach {session ->
            session.send(Mono.just(session.textMessage(msg))).subscribe()
        }
    }
}