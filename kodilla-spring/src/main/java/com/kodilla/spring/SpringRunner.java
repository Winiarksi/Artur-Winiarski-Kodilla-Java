package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // zwalnia z wpisania adnotacji: @ComponentScan oraz @EnableAutoConfiguration
public class SpringRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRunner.class, args);
	}
}
