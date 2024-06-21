package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Department")

public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int deptId;
    private String name;
    private String description;

    private String status;

    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private String modifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;


}
