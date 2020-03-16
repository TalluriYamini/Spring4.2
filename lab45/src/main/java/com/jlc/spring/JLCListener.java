package com.jlc.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JLCListener implements ApplicationListener {

	@EventListener
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("\nJLCListener - Started");
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
		System.out.println("JLCListener - Ended");
	}
}
