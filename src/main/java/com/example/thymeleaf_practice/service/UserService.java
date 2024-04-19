package com.example.thymeleaf_practice.service;

import com.example.thymeleaf_practice.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
}
