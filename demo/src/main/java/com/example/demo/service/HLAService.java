package com.example.demo.service;

import com.example.demo.entity.HLA;
import com.example.demo.repository.HLARepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HLAService {
    @Autowired
    HLARepository repository;

    public List<HLA> findAll() {
        return repository.findAll();
    }
}