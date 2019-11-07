package com.example.demo.repository;

import com.example.demo.entity.contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactRepository extends JpaRepository<contact, Long> {
}