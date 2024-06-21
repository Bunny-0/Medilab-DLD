package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserType")
@Data
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String userType;

}
