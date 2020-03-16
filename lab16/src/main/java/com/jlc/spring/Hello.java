package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	@Autowired(required = false)
	private A aobj;

	@Autowired(required = false)
	private B bobj;

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
