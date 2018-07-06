package com.BaseApp.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.convert.Jsr310Converters;

@SpringBootApplication
@EntityScan(basePackageClasses = { BaseApp.class, Jsr310Converters.class})
public class BaseApp {

	public static void main(String[] args) {
		SpringApplication.run(BaseApp.class, args);
	}
}
