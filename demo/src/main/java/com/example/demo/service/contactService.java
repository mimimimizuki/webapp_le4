package com.example.demo.service;

import com.example.demo.entity.contact;
import com.example.demo.repository.contactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class contactService {
    @Autowired
    contactRepository repository;

    public List<contact> findAll() {
        return repository.findAll();
    }

}