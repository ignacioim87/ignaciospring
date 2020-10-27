package com.unla.ignaciospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.unla.ignaciospring.controllers"})
public class IgnaciospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgnaciospringApplication.class, args);
	}

}
