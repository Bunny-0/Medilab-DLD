package com.example.MediLab.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Table(name = "AuditInfo")
@Data
public class AuditInfo implements Serializable {


    private String createdBy;
    private Date createdDate;

    private String modifiedBy;
    private Date modifiedDate;
}
