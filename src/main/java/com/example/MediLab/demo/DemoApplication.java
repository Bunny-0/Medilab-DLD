package com.example.MediLab.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
 @Autowired
 RoleRepo manager;

 @Autowired
 PermissionRepo permissionRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	UserPermission permission=new UserPermission();
	permission.setName("edit");
	permissionRepo.save(permission);

	UserRole userRole=new UserRole();
	userRole.setName("Admin");

	Set<UserRoleToPermission> permissionSet=new HashSet<>();
	UserRoleToPermission userRoleToPermission=new UserRoleToPermission();
	userRoleToPermission.setUserPermission(permission);
	userRoleToPermission.setUserRole(userRole);

	userRole.setPermissionsSet(permissionSet);
	manager.save(userRole);

	}
}
