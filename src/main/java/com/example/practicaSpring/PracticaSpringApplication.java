package com.example.practicaSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaSpringApplication {

	public static final Logger log = LoggerFactory.getLogger(PracticaSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PracticaSpringApplication.class, args);
	}

}
