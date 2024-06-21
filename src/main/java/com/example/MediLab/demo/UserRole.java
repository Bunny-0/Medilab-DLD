package com.example.MediLab.demo;


import jakarta.persistence.*;
import jdk.jfr.MemoryAddress;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "UserRole")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false,updatable = true,unique = true)
    String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "userRole")
    Set<UserRoleToPermission> permissionsSet;

}
