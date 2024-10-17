package org.example.controller;

//import org.example.publictransport.service.UserService;
import org.example.publictransport.Payment;
import org.example.service.PaymentService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService; // Используйте импортированный класс
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<SecurityProperties.User> createUser(@RequestBody SecurityProperties.User user) {
        SecurityProperties.User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
    @PostMapping("/pay")
    public String pay(@RequestBody Payment payment) {
        paymentService.processPayment(payment);
        return "Payment processed!";
    }

    @GetMapping
    public ResponseEntity<List<SecurityProperties.User>> getAllUsers() {
        List<SecurityProperties.User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SecurityProperties.User> getUserById(@PathVariable Integer id) {
        SecurityProperties.User user;
        user = userService.getUserById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
