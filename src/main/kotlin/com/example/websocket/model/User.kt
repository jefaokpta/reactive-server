package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Table("users")
class User(
        @Id
        val id: UUID = UUID.randomUUID(),
        @NotEmpty
        val name: String,
        @NotEmpty
        val password: String
) {
}