package com.caderneta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CadernetaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadernetaEurekaServerApplication.class, args);
	}

}
