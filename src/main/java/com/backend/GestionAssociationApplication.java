package com.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.backend.models")
public class GestionAssociationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionAssociationApplication.class, args);
	}

}
