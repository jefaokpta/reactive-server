package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Table("persons")
class Person(
        @Id
        val id: Int,
        @NotEmpty
        @NotNull
        val name: String,
        @NotNull
        val age: Int,
        val telephone: String = ""
) {
}