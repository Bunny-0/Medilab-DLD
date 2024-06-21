package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Address")
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String country;
    String state;
    String city;
    String PostalCode;
    String addressInfo;

}
