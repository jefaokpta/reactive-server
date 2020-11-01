package com.example.websocket.endpoint

import com.example.websocket.model.User
import com.example.websocket.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1/users")
class UserEndpoint(val userService: UserService) {

    @GetMapping
    fun getAll() = userService.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: String) = userService.get(id)
            .switchIfEmpty(Mono.error(ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario não encontrado.")))

    @PostMapping()
    fun save(@RequestBody user: User) = userService.save(user)
            .then(userService.get(user.id))
}