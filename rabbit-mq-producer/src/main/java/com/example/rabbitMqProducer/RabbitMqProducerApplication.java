package com.example.rabbitMqProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RabbitMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqProducerApplication.class, args);
	}

}
