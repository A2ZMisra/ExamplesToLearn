package com.log.compare.fect.api.info.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.log.compare.fect.api.info.service.repository.APIInfoRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LogCompareFetchApiInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogCompareFetchApiInfoServiceApplication.class, args);
	}

	@Bean
	APIInfoRepository repository() {
		return new APIInfoRepository();
	}
}

