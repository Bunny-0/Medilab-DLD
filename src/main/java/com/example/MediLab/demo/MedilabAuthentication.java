package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Table(name = "MedilabAuthentication")
@Data
public class MedilabAuthentication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String userName;
    String password;
}
