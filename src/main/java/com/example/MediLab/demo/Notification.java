package com.example.MediLab.demo;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "Notification")
public class Notification implements Serializable {

    private int notificationId;

    private String title;
    private String body;

    @Temporal(TemporalType.TIMESTAMP)
    private Date notificationDate;

    private String createdBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private String modifiedBy;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "notificationType")
    private String NotificationType;
}
