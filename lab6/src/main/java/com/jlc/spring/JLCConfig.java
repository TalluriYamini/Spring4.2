package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JLCConfig {
	@Bean
	@Scope("prototype") // (default singleton)
	@Lazy(true)
	public Hello hello() {
		return new Hello();
	}

	// session,request,global-session are consider in web-application

}
