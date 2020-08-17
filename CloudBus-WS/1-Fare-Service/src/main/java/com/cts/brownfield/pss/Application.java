package com.cts.brownfield.pss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources(value = {@PropertySource("b1.p"),@PropertySource("b2.p")})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
