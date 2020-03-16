package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class JLCManager {

	@Autowired
	private ApplicationEventPublisher publisher;

	public void addBatch(Batch bat) {
		publisher.publishEvent(new BatchEvent(this, bat));
	}

	public void addWorkshop(Workshop ws) {
		publisher.publishEvent(new WorkshopEvent(this, ws));
	}

	public void createHello() {
		publisher.publishEvent(new HelloEvent());
	}

}
