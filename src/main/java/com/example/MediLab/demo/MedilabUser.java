package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "MedilabUser")
@Data

public class MedilabUser extends AuditInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String firstname;
    String lastname;
    String userid;
    String email;
    @Temporal(value = TemporalType.TIMESTAMP)
    String dob;
    String gender;
    String shortBiography;
    boolean status;
    @OneToOne
    UserRole role;
    @OneToOne
    Address address;

    @OneToOne
    UserType userType;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
            @JoinColumn(name = "")
    List<Notification> notificationList;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Document> documentList;








}
