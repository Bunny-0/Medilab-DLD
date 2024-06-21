package com.example.MediLab.demo;

import com.example.MediLab.demo.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<UserRole,Integer> {
}
