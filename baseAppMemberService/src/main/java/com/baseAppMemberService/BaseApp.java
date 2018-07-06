package com.baseAppMemberService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BaseApp {

	public static void main(String[] args) {
		SpringApplication.run(BaseApp.class, args);
	}

}
