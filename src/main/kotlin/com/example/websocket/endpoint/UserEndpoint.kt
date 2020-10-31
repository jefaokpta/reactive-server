package com.example.websocket.endpoint

import com.example.websocket.model.User
import com.example.websocket.service.UserService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1/users")
class UserEndpoint(val userService: UserService) {

    @GetMapping
    fun getAll() = userService.getAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: String): Mono<User> {
        return userService.get(id)
    }

    @PostMapping()
    fun save(@RequestBody user: User) = userService.save(user)
}