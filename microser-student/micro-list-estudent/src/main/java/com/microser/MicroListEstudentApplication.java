package com.microser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class MicroListEstudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroListEstudentApplication.class, args);
	}

}
