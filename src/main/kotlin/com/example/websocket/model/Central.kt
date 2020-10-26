package com.example.websocket.model

import org.springframework.web.reactive.socket.WebSocketSession

class Central {

    companion object{
        val sessions = mutableListOf<WebSocketSession>()
    }
}