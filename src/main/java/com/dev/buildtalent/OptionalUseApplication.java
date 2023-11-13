package com.dev.buildtalent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.dev.buildtalent.*")
public class OptionalUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptionalUseApplication.class, args);
	}

}
