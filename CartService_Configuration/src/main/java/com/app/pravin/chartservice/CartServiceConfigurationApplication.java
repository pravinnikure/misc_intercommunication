package com.app.pravin.chartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CartServiceConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceConfigurationApplication.class, args);
	}

}
