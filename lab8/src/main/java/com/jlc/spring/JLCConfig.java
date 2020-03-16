package com.jlc.spring;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JLCConfig {

	@Bean
	public List<String> emails() { // @Bean(name = "emails")
									// public List<String> createList()
		List<String> emails = new ArrayList<String>();
		emails.add("aa@jlc.com");
		emails.add("bb@jlc.com");
		emails.add("cc@jlc.com");
		emails.add("dd@jlc.com");
		return emails;
	}

	@Bean
	public Set<Long> phones() {
		Set<Long> phones = new LinkedHashSet<Long>();
		phones.add(1111L);
		phones.add(2222L);
		phones.add(3333L);
		phones.add(4444L);
		return phones;
	}

	@Bean(name = "refs")
	public Map<String, Long> references() {
		Map<String, Long> refs = new LinkedHashMap<String, Long>();
		refs.put("AA", 11L);
		refs.put("BB", 22L);
		refs.put("CC", 33L);
		return refs;
	}

	@Bean(name = "myprops")
	public Properties myProperties() {
		Properties prop = new Properties();
		prop.put("AA", 11);
		prop.put("BB", 22);
		prop.put("CC", 33);
		return prop;
	}

	@Bean
	public Address address() {
		return new Address("Bangalore", "Mathikere", "KA");
	}

	@Bean
	public Account account1() {
		Account acc1 = new Account();
		acc1.setAccno(11);
		acc1.setAtype("SA");
		acc1.setBal(10000.0);
		return acc1;
	}

	@Bean(name = "accounts")
	public List<Account> accounts() {
		List<Account> accounts = new ArrayList<Account>();

		Account acc2 = new Account();
		acc2.setAccno(12);
		acc2.setAtype("FD");
		acc2.setBal(20000.0);

		accounts.add(account1());
		accounts.add(acc2);
		return accounts;
	}

	@Bean(name = "cust")
	public Customer customer(Address add) {
		Customer cust = new Customer(101, "Sri", "sri@jlc.com", 9999L);
	    cust.setAddress(add);
	    return cust;
	}
}
