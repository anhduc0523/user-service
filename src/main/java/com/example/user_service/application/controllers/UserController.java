package com.example.user_service.application.controllers;

import com.example.user_service.domain.dtos.CreateUserRequestDTO;
import com.example.user_service.domain.dtos.UpdateUserRequestDTO;
import com.example.user_service.domain.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("info")
    public ResponseEntity<Object> info() {
        return ResponseEntity.ok(userService.info());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable Long id) {
        return ResponseEntity.ok(userService.get(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.ok(userService.delete(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody UpdateUserRequestDTO updateUserRequest) {
        return ResponseEntity.ok(userService.update(id, updateUserRequest));
    }


}