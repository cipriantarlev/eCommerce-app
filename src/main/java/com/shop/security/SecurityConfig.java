package com.shop.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
<<<<<<< HEAD
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	public void conifureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("user").password("{noop}password").roles("USER");
	}

	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()

				.antMatchers("/homepage/**").hasRole("USER")
				.and()
			.formLogin()
			//.loginPage("/login")
			.defaultSuccessUrl("/homepage", true)
=======
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("user").password("{noop}password").roles("USER");
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
>>>>>>> 2eadb649f4d0b925d55bf6c45517df0b3d6b52ed
				.and()
			.httpBasic();
	}
}
