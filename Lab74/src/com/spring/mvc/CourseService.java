package com.spring.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class CourseService {
	public ArrayList<String> getCourses() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add("JDBC");
		al.add("Servlets");
		al.add("JSP");
		al.add("Struts");
		al.add("JSF");
		return al;

	}

}
