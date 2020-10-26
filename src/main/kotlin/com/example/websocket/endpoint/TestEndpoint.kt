package com.example.websocket.endpoint

import com.example.websocket.handler.PeerHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/msg")
class TestEndpoint(private val peerHandler: PeerHandler){

    @GetMapping("/{msg}")
    fun send(@PathVariable msg: String){
        peerHandler.sendMessage(msg)
    }
}