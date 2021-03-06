package com.baseApp.cloudDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;



@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class Lab4EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4EurekaServerApplication.class, args);
	}
}
