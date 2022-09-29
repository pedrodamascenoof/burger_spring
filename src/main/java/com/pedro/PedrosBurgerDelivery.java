package com.pedro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableEurekaClient
@ComponentScan(basePackages = "com.pedro")
public class PedrosBurgerDelivery {

	public static void main(String[] args) {
		SpringApplication.run(PedrosBurgerDelivery.class, args);
	}
} 
