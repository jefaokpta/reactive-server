package com.example.websocket.repository

import com.example.websocket.model.User
import org.springframework.data.r2dbc.repository.Modifying
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono
import java.util.*

interface UserRepository: ReactiveCrudRepository<User, UUID> {

    @Query("INSERT INTO users (id, name, password) VALUES ($1, $2, $3)")
    @Modifying
    fun insert(id: UUID, name: String, pass: String): Mono<User>

}