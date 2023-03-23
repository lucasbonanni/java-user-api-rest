package com.example.users.controllers;

import com.example.users.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    public ResponseEntity<User> Create(@RequestBody User user) {
        return ResponseEntity.ok(new User());
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> Get(){
        return ResponseEntity.ok(new ArrayList<>() {
            {
               add(new User());
               add(new User());
               add(new User());
            }
        });
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> GetById(@PathVariable UUID id){
        return ResponseEntity.ok(new User());
    }

    @PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> Update(@PathVariable UUID id, @RequestBody User user){
        return ResponseEntity.ok(new User());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> Delete(@PathVariable UUID id){
        return ResponseEntity.ok(null);
    }
}
