package com.roberts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Harrison Roberts
 *
 * This is the main class for the spring application. The SpringBootApplication annotation tells Spring that this
 * is a Spring Boot Application (duh)
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * Main method. Tells the Spring Boot framework to go ahead and start up the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}