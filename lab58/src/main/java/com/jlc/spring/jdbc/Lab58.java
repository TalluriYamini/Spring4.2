package com.jlc.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab58 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		// 1.getCustomersByCid
		System.out.println("getCustomersByCid");
		CustomerTo cto = cdao.getCustomerByCid(106);
		System.out.println(cto);
		// 2.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTo> list = cdao.getAllCustomers();
		for (CustomerTo ct : list) {
			System.out.println(ct);
		}
		// 3.getCustomersByEmail
		System.out.println("getCustomersByEmail");
		cto = cdao.getCustomerByEmail("sri2@jlc.com");
		System.out.println(cto);
		// 4.getCustomerByCity
		System.out.println("getCustomerByCity");
		list = cdao.getCustomersByCity("bnglr");
		for (CustomerTo ct : list) {
			System.out.println(ct);
		}
		// 5.getCustomerCount
		System.out.println("getCustomerCount");
		int count = cdao.getCustomerCount();
		System.out.println("No of Cust::" + count);
		// 6.getCustomerCityByEmail
		System.out.println("getCustomerCityByEmail");
		String ci = cdao.getCustomerCityByEmail("abcd@jlc.com");
		System.out.println(ci);
		// 7.getCustomerPhoneByEmail
		System.out.println("getCustomerPhoneByEmail");
		long ph = cdao.getCustomerPhoneByEmail("vas@jlc.com");
		System.out.println(ph);

	}
}
