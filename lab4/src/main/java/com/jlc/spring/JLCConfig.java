package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JLCConfig {
	@Bean
	@Scope("prototype") // (default singleton)
	public Hello hello() {
		return new Hello();
	}

	// session,request,global-session are consider in web-application

}
