package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "NotificationType")
public class NotificationType implements Serializable {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String notificationType;
}
