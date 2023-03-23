package com.example.users.controllers;

import com.example.users.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    public ResponseEntity<User> Post(@RequestBody User user) {
        return ResponseEntity.ok(new User());
    }
}
