package com.example.MediLab.demo;

import com.example.MediLab.demo.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface PermissionRepo extends JpaRepository<UserPermission,Integer> {
}
