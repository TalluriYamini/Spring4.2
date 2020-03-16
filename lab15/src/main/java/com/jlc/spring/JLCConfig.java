package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {

	@Bean
	public Hello hello() {
		return new Hello();
	}

}
