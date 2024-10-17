package org.example.service;


import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public SecurityProperties.User createUser(SecurityProperties.User user) {
        return userRepository.save(user);
    }

    public List<SecurityProperties.User> getAllUsers() {
        return userRepository.findAll();
    }

    public SecurityProperties.User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
    public void registerUser(SecurityProperties.User user) {
        userRepository.save(user);
    }
}
