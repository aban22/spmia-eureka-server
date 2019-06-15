package com.thoughtmechanix.core.spmiaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpmiaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmiaEurekaServerApplication.class, args);
	}

}
