package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:common.properties", "classpath:mysql.properties", "classpath:oracle.properties" })
public class JLCConfig {

	@Autowired
	private Environment env;

	@Value("${jlc.pw}")
	private String password;

	@Value("${jlc.min}")
	private int min;

	@Value("${jlc.max}")
	private int max;

	@Value("${jlc.timeout}")
	private int timeout;

	@Bean(name = "mysqlDS")
	public DataSource mysqlDataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClass(env.getProperty("mysql.dc"));
		ds.setUrl(env.getProperty("mysql.url"));
		ds.setUsername(env.getProperty("mysql.un"));
		ds.setPassword(password);
		ds.setMin(min);
		ds.setMax(max);
		ds.setTimeout(timeout);
		return ds;
	}

	@Bean(name = "oracleDS")
	public DataSource oracleDataSource(@Value("${oracle.dc}") String driverClass, @Value("${oracle.url}") String url,
			@Value("${oracle.un}") String username) {
		DataSource ds = new DataSource();
		ds.setDriverClass(driverClass);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setMin(min);
		ds.setMax(max);
		ds.setTimeout(timeout);
		return ds;
	}

	@Bean
	public TestBean test() {
		return new TestBean();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
