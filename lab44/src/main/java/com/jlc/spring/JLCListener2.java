package com.jlc.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class JLCListener2 implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("JLCListener2 - Started");
		System.out.println("Batch Event is raised");
		BatchEvent be = (BatchEvent) event;
		System.out.println(be.getBatch());
		System.out.println("JLCListener2 - Ended");

	}

}
