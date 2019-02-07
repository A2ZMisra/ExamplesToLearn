package com.log.compare.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LogCompareDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogCompareDiscoveryServiceApplication.class, args);
	}

}

