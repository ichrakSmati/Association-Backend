package com.backend;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.backend.models.Role;
import com.backend.models.User;
import com.backend.service.RoleService;
import com.backend.service.UserService;


@SpringBootApplication
@EntityScan("com.backend.models")
@ComponentScan({"com.backend.service","com.backend.controller","com.backend.conf"})
public class GestionAssociationApplication {

	@Autowired
	static UserService us;
	
	@Autowired
	static RoleService rs;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(GestionAssociationApplication.class, args);
		
		
		//BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		/*
		us=(UserService)applicationContext.getBean("userService");
		rs=(RoleService)applicationContext.getBean("roleService");
		
		rs.addRole(new Role(1,"ROLE_ADMIN"));
		rs.addRole(new Role(2,"ROLE_PUBLISHER"));
		rs.addRole(new Role(3,"ROLE_MEMBER"));
		
		User u1 = new  User();
		u1.setDateNaissance(new Date());
		u1.setEmail("u1@test.test");
		u1.setNom("fake1");
		u1.setPrenom("user1");
		u1.setRole(rs.findById(1));
		//u1.setPass(bCryptPasswordEncoder.encode("123"));
		u1.setPass("123");
		u1.setPhoto("cool");
		u1.setEtat(true);
		us.addUser(u1);
		
		User u2 = new  User();
		u2.setDateNaissance(new Date());
		u2.setEmail("u2@test.test");
		u2.setNom("fake2");
		u2.setPrenom("user2");
		u2.setRole(rs.findById(1));
		//u2.setPass(bCryptPasswordEncoder.encode("123"));
		u2.setPass("123");
		u2.setPhoto("cool");
		u2.setEtat(true);
		us.addUser(u2);
		*/
		
	}

}
