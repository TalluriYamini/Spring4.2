package com.jlc.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Configuration
public class JLCConfig {

	@Bean
	public Student student() {
		Student st = new Student();
		st.setSname("Sri");
		st.setPhone(12345);
		return st;
	}

	@Bean(name = "sid")
	public String studentId() {
		return "B99-101";
	}

	@Bean
	public String fee() {
		return "10000,5000,5000";
	}

	@Bean
	public String emails() {
		return "aa@jlc.com,bb@jlc.com,cc@jlc.com,dd@jlc.com";
	}

	@Bean
	public List<Long> phones() {
		List<Long> phones = new ArrayList<Long>();
		phones.add(1111L);
		phones.add(2222L);
		phones.add(3333L);
		return phones;
	}

	@InitBinder
	public void initBinderAll(WebDataBinder binder) {
		binder.registerCustomEditor(List.class, new ListEditor());
		binder.registerCustomEditor(Fee.class, new FeeEditor());
		binder.registerCustomEditor(StudentID.class, new StudentIDEditor());
	}

	/*
	 * //customEditor configuration public CustomEditorConfigurer customEditor() {
	 * System.out.println("customEditor");
	 * 
	 * CustomEditorConfigurer cec = new CustomEditorConfigurer(); Map m = new
	 * HashMap(); m.put(List.class, ListEditor.class); m.put(Fee.class,
	 * FeeEditor.class); m.put(StudentID.class, StudentIDEditor.class);
	 * cec.setCustomEditors(m); return cec; }
	 */

}
