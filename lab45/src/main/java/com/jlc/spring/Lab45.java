package com.jlc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab45 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		ctx.start();
		JLCManager jlc = (JLCManager) ctx.getBean("jlc");
		Batch batch = new Batch("B-24", "28-Apr-2010", "6.30-8.30", 150);
		jlc.addBatch(batch);
		Workshop ws = new Workshop("Web Services", 5000, 99);
		jlc.addWorkshop(ws);
		jlc.createHello();
		ctx.stop();
		ctx.close();
	}
}

//when no beans is found with matching data type then bean property will not be injected