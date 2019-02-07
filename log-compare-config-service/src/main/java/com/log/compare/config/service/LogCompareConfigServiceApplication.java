package com.log.compare.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LogCompareConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogCompareConfigServiceApplication.class, args);
	}

}

