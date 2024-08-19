package com.telusko.basicSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class BasicSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringSecurityApplication.class, args);
	}

}
