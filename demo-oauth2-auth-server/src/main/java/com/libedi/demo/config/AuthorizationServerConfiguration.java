package com.libedi.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

/**
 * AuthorizationServerConfiguration
 * - 구체적으로 설정하려면 AuthorizationServerConfigurerAdapter를 상속받아 사용한다.
 * @author Sangjun, Park
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration {

	@Bean
	public TokenStore jdbcTokenStore(final DataSource dataSource) {
		return new JdbcTokenStore(dataSource);
	}
}
