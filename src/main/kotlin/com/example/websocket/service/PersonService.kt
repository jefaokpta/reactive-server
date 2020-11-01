package com.example.websocket.service

import com.example.websocket.model.Person
import com.example.websocket.repository.PersonRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class PersonService(val personRepository: PersonRepository) {

    fun getAll() = personRepository.findAll()

    fun save(person: Person): Mono<Person> {
        return personRepository.save(person)
    }
}