package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("applicationContext.xml")
public class JLCConfig {

	public JLCConfig() {
		System.out.println("Spring Container is now getting ready");
	}

	@Bean(name = "hello")
	public Hello getHello() {
		System.out.println("getHello()");
		return new Hello();

	}
}
