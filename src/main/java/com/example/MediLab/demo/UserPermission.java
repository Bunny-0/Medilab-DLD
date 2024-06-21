package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "UserPermission")
@Data

public class UserPermission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false,unique = true)
    String name;

    private String createdBy;
    private Date createdDate;

    private String modifiedBy;
    private Date modifiedDate;

}
