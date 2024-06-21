package com.example.MediLab.demo;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String title;
    private String description;
    private String documentPath;
    private  String docKey;

    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private String modifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    private String loggedInUserId;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "statusID")
    private DocumentStatus status;


}
