package com.example.demo.service;

import com.example.demo.entity.user;
import com.example.demo.repository.userRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userService {
    @Autowired
    userRepository repository;

    public List<user> findAll() {
        return repository.findAll();
    }
}