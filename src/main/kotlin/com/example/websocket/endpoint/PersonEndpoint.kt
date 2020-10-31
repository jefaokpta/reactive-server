package com.example.websocket.endpoint

import com.example.websocket.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/persons")
class PersonEndpoint(val personService: PersonService) {

    @GetMapping
    fun getAll() = personService.getAll()
}