package com.example.MediLab.demo;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DocumentStatus")
@Data
public class DocumentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int statusId;
    String statusName;
}
