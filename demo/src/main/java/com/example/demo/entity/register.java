package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(name = "patient_or_donor")
    private String patient_or_donor;
    @Column(name = "hla_id")
    private Long hla_id;

    public Long getUserId() {
        return user_id;
    }

    public void setUserId(Long user_id) {
        this.user_id = user_id;
    }

    public String getPD() {
        return patient_or_donor;
    }

    public void setPD(String patient_or_donor) {
        this.patient_or_donor = patient_or_donor;
    }

    public Long getHLAId() {
        return hla_id;
    }

    public void setHLAId(Long hla_id) {
        this.hla_id = hla_id;
    }
}