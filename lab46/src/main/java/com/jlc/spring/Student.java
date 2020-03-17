package com.jlc.spring;

public class Student {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return "Hello" + name;
	}
}
