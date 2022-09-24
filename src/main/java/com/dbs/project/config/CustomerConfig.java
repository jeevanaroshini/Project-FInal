package com.dbs.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class CustomerConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure (AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("Rajesh").password("Suresh").roles("employee").and()
		.withUser("Abcdef").password("abcdef").roles("timepasser");
	}
	public void configure(HttpSecurity http)throws Exception{
		http.httpBasic().and().authorizeRequests().
		antMatchers("/employee").hasRole("employee")
		//.antMatchers("/user").hasAnyRole("superman","timepasser")
		//.antMatchers("/home").permitAll()
		.and().headers().frameOptions().disable().and().cors().disable().formLogin();
		
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
