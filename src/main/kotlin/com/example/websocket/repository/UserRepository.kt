package com.example.websocket.repository

import com.example.websocket.model.User
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*

interface UserRepository: ReactiveCrudRepository<User, UUID> {
}