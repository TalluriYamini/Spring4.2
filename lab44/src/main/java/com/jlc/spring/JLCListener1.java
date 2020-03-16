package com.jlc.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class JLCListener1 implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("JLCListener1 - Started");
		if (event instanceof BatchEvent) {
			BatchEvent batchevent = (BatchEvent) event;
			Batch bat = batchevent.getBatch();
			System.out.println(bat);
		} else if (event instanceof WorkshopEvent) {
			WorkshopEvent wsEvent = (WorkshopEvent) event;
			Workshop ws = wsEvent.getWorkshop();
			System.out.println(ws);
		} else {
			System.out.println(event);
		}
		System.out.println("JLCListener1 - Ended");
	}
}
