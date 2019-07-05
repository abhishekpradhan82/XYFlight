package com.xyairline.booking.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class XyFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyFlightApplication.class, args);
	}

}
