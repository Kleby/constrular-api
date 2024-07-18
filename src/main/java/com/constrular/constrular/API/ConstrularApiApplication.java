package com.constrular.constrular.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ConstrularApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstrularApiApplication.class, args);
	}

}
