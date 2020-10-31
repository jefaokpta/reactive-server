package com.example.websocket.service

import com.example.websocket.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val personRepository: PersonRepository) {

    fun getAll() = personRepository.findAll()
}