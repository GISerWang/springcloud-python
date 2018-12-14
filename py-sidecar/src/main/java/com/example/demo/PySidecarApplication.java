package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class PySidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PySidecarApplication.class, args);
	}
}
