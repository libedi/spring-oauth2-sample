package com.libedi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class DemoOauth2ApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2ApiServerApplication.class, args);
	}
}
