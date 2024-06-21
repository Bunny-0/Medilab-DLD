package com.example.MediLab.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "USER_ROLE_PERMISSIONS_SET")
public class UserRoleToPermission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    private UserRole userRole;

    @ManyToOne
    private UserPermission userPermission;

}
