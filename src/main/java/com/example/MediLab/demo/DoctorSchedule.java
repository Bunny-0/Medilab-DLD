package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name = "DoctorSchedule")
@Entity
public class DoctorSchedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;


}
