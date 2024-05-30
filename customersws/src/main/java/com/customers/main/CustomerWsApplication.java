package com.customers.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.customers.controllers","com.customers.service",
                                "com.customers.serviceimpl","com.customers.dao","com.customers.daoimpl"})
public class CustomerWsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerWsApplication.class, args);
	}

}
