package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@EnableResourceServer	// API서버측 : OAuth2 인증을 받게 만든다.
@EnableAuthorizationServer	// 인증서버측 : OAuth2 인증을 활성화 시킨다. 
@SpringBootApplication
public class DemoOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoOauth2Application.class, args);
	}
	
	@Bean
	public TokenStore jdbcTokenStore(final DataSource dataSource) {
		return new JdbcTokenStore(dataSource);
	}
}
