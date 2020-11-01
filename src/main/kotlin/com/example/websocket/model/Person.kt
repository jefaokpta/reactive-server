package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("persons")
class Person(
        @Id
        var id: Long?,
        val name: String,
        val age: Int,
        val telephone: String?
) {
}