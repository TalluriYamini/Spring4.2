package com.spring.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	@Autowired
	private CourseService cs;

	@RequestMapping(value = "/course.mvc")
	protected String getCourse(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ArrayList<String> al = cs.getCourses();
		req.setAttribute("ALL", al);
		return "show";
	}

}
