package com.jlc.spring;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {

	@Inject  //JSR-330  'javax.inject.Inject' annotation found and supported for autowiring
	private A aobj;

	@Inject    //default byType
	@Qualifier("bo2")  //byName
	private B bobj;

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
