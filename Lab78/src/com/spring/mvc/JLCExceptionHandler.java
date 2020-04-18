package com.spring.mvc;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class JLCExceptionHandler {
	/*
	 * @ExceptionHandler(StudentNotFoundException.class) public ModelAndView
	 * studentNotFound(StudentNotFoundException exe) {
	 * System.out.println("----Caught StudentNotFoundException----"); ModelAndView
	 * mav = new ModelAndView(); mav.addObject("msg", exe.getMessage());
	 * mav.setViewName("sidsearch"); return mav; }
	 */

	@ExceptionHandler(StudentNotFoundException.class)
	public String handlestudentNotFound(StudentNotFoundException exe) {
		System.out.println("----Caught StudentNotFoundException----");
		return "sidsearch";
	}
}
