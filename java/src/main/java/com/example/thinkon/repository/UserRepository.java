package com.example.thinkon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thinkon.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
