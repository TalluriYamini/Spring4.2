package com.jlc.spring.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab64 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTo> list = cdao.getAllCustomers();
		for (CustomerTo customerTo : list) {
			System.out.println(customerTo);
		}

		// 2.getCustomerByEmail
		System.out.println("getCustomerByEmail");
		CustomerTo cto = cdao.getCustomerByEmail("sar@gmail.com");
		System.out.println(cto);

		// 3.getCustomersByCity
		System.out.println("getCustomersByCity");
		list = cdao.getCustomersByCity("bnglr");
		for (CustomerTo customerTo : list) {
			System.out.println(customerTo);
		}

		// 4.getCustomersCount
		System.out.println("getCustomersCount");
		int count = cdao.getCustomersCount();
		System.out.println("No.of cust" + count);

		// 5.getCustomerCityByEmail
		System.out.println("getCustomerCityByEmail");
		String city = cdao.getCustomerCityByEmail("yam@gmail.com");
		System.out.println(city);

		// 5.getCustomerPhoneByEmail
		System.out.println("getCustomerPhoneByEmail");
		Long phone = cdao.getCustomerPhoneByEmail("yam@gmail.com");
		System.out.println(phone);
	}
}
