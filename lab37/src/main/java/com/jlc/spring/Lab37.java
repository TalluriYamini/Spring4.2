package com.jlc.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Lab37 {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println("....Spring Container is now Ready...");
		System.out.println("---------------");
		Hello hello = (Hello) factory.getBean("HELLO"); // byType
		hello.show();
		System.out.println("---------------");
		System.out.println("Spring Container going to shutdown...");

	}
}

//when no beans is found with matching data type then bean property will not be injected