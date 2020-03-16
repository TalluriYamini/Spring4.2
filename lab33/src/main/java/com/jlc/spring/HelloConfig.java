package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HaiConfig.class)
public class HelloConfig {

	@Bean(name = "hello")
	public Hello getHello() {
		return new Hello();

	}
}
