package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.util.*
import javax.annotation.Generated
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Table("users")
class User(
        @Id
        val id: UUID = UUID.randomUUID(),
        @NotNull @NotEmpty
        val name: String,
        @NotNull @NotEmpty
        val password: String
) {
}