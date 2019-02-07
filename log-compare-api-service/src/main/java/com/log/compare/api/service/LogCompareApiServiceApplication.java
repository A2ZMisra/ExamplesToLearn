package com.log.compare.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.log.compare.api.service.repository.APIRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class LogCompareApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogCompareApiServiceApplication.class, args);
	}
	
	@Bean
	APIRepository repository() {
		return new APIRepository();
	}

}

