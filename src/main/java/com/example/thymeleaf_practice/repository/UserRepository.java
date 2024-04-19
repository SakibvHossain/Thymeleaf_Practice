package com.example.thymeleaf_practice.repository;

import com.example.thymeleaf_practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
