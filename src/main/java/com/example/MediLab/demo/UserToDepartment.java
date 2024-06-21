package com.example.MediLab.demo;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;

public class UserToDepartment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userToDeptId;
    @OneToOne
    MedilabUser user;
    @OneToOne
    Department dept;
}
