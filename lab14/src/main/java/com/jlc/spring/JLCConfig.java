package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {

	@Bean
	public A createA() {
		A aobj = new A();
		aobj.setA(10);
		aobj.setMsg("AAA");
		return aobj;
	}

	@Bean
	public Hello hello() {
		return new Hello();
	}

	@Bean
	public B createB() { // bobj()
		return new B(20, "BBB");
	}
}
