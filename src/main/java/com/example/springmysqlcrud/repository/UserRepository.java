package com.example.springmysqlcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmysqlcrud.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    
}
