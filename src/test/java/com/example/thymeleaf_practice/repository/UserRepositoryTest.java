package com.example.thymeleaf_practice.repository;

import com.example.thymeleaf_practice.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void createUser(){
        User user = new User();
        user.setUsername("Mia");
        user.setGmail("mia@gmail.com");
        user.setPassword("1xssdES3");
        User saved_user = repository.save(user);
        Assertions.assertEquals("Mia",saved_user.getUsername());
    }
}