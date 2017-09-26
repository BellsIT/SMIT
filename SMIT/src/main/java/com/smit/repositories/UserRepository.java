package com.smit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smit.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>,CrudRepository<User, Long> {

    User findByName(String name);
//    User findBysurName(String surName);
    List<User> findAll();
    
}
