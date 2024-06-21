package com.example.MediLab.demo;

import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

public class TokenAuditInfo implements Serializable {


    private String createdBy;
    private Date createdDate;

    private String modifiedBy;
    private Date modifiedDate;

    private String authnStore;
    private Date tokenRefreshedTime;
    private String olderAccessToken;
    private String newAccessToken;

    private String Subject;

    @OneToOne
    private MedilabAuthToken authToken;

}
