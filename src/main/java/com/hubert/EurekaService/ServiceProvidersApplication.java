package com.hubert.EurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProvidersApplication.class, args);
	}
}
