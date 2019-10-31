package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hla")
public class HLA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hla_id;
    @Column(name = "a")
    private int a;
    @Column(name = "b")
    private int b;
    @Column(name = "c")
    private int c;
    @Column(name = "dr")
    private int dr;

    public Long getId() {
        return hla_id;
    }

    public void setId(Long hla_id) {
        this.hla_id = hla_id;
    }

    public int getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public int getDR() {
        return dr;
    }

    public void setDR(Integer dr) {
        this.dr = dr;
    }
}