package com.example.websocket.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Table("persons")
class Person(
        @Id
        var id: Long?,
        @NotNull @NotEmpty
        val name: String,
        @NotNull @NotEmpty
        val age: Int,
        val telephone: String?
) {
}