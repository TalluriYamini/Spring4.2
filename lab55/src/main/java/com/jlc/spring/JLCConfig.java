package com.jlc.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JLCConfig {

	@Bean
	public DataSource mysqlDS() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/yam");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean(name = "ts")
	public TestService testService() {
		return new TestService();

	}
}
