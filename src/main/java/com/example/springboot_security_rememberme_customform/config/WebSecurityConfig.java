package com.example.springboot_security_rememberme_customform.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //PROPERTIES
  private final UserDetailsService userDetailsService;

  //=================================================================
  // CONFIGURE
  //=================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //ENABLE REMEMBER ME COOKIE
    httpSecurity.rememberMe().key("something").userDetailsService(userDetailsService);

    //DISABLE CSRF
    httpSecurity.csrf().disable();

    //ANONYMOUS ACCESS
    httpSecurity.authorizeRequests().antMatchers("/CustomLoginForm").permitAll();

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin()
      .loginPage("/CustomLoginForm")
      .loginProcessingUrl("/login");

  }

}



