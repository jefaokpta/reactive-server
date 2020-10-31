package com.example.websocket.service

import com.example.websocket.model.User
import com.example.websocket.repository.UserRepository
import com.example.websocket.util.convertToUUID
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

@Service
class UserService(val userRepository: UserRepository) {

    fun getAll() = userRepository.findAll()

    fun get(id: String) = userRepository.findById(
                convertToUUID(id).let { it?: return Mono.empty<User>() }
        )

    fun save(user: User) = userRepository.save(user)
}