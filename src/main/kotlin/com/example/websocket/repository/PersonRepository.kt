package com.example.websocket.repository

import com.example.websocket.model.Person
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PersonRepository: ReactiveCrudRepository<Person, Int> {
}