package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("users")
class User(
        @Id
        val id: UUID = UUID.randomUUID(),
        val name: String,
        val password: String
) {
}