package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;



@Entity
@Data
@Table(name = "MedilabAuthToken")

public class MedilabAuthToken implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String access_token;
    String id_token;
    String refresh_token;
    String expiry;
    String token_type;
}
