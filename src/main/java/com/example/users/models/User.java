package com.example.users.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID id;

    @NotEmpty
    private String name;

    @Email
    private String email;

}
