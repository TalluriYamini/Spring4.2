package com.jlc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@ComponentScan(basePackages = { "com.jlc.spring" })
public class JLCConfig {

	@Bean(name = "jlc")
	public JLCManager getManager() {
		return new JLCManager();
	}

	@EventListener
	public void handleBatchEvent(BatchEvent event) {
		System.out.println("\n JLCListener -> handleBatchEvent");
		System.out.println("\n BatchEvent is raised");
		System.out.println(event.getBatch());
	}
	
	@EventListener
	public void handleWorkshopEvent(WorkshopEvent event) {
		System.out.println("\n JLCListener -> handleWorkshopEvent");
		System.out.println("\n WorkshopEvent is raised");
		System.out.println(event.getWorkshop());
	}
	
	@EventListener
	public void handleHelloEvent(HelloEvent event) {
		System.out.println("\n JLCListener -> handleHelloEvent");
		System.out.println("\n HelloEvent is raised");
		event.show();
	}

}
