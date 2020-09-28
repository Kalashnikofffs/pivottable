package ru.kalashnikof.pivottable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class PivottableApplication {

	public static void main(String[] args) {

		SpringApplication.run(PivottableApplication.class, args);
	}



}