package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if ("admin".equals(username) && "root".equals(password)) {
            return "Login successful!";
        }
        return "Invalid credentials!";
    }

    // Методы управления приложением
}
