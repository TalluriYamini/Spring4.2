package com.jlc.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class JLCListener3 implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("JLCListener3 - Started");
		System.out.println("WorkshopEvent is raised");
		WorkshopEvent we = (WorkshopEvent) event;
		System.out.println(we.getWorkshop());
		System.out.println("JLCListener3 - Ended");
	}

}
