package com.example.websocket.endpoint

import com.example.websocket.model.Person
import com.example.websocket.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/persons")
class PersonEndpoint(val personService: PersonService) {

    @GetMapping
    fun getAll() = personService.getAll()

    @PostMapping()
    fun save(@RequestBody person: Person) = personService.save(person)
}