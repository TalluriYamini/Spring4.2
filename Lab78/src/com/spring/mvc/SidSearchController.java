package com.spring.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("sidSearchCommand")
public class SidSearchController {

	@Autowired
	private SidValidator sidValidator;

	@RequestMapping(value = "/searchStudent.mvc", method = RequestMethod.POST)
	public String searchStudent(@ModelAttribute("sidSearchCommand") SidSearchCommand sidSearchCommand,
			BindingResult errors, Model model, HttpServletRequest req) throws ServletException {
		String result = "sidsearch";
		System.out.println("searchStudent");
		sidValidator.validate(sidSearchCommand, errors);
		if (errors.hasErrors()) {
			System.out.println(errors.getErrorCount());
			return result;
		}

		String sid = sidSearchCommand.getSid();
		System.out.println(sid);
		if (sid.equals("JLC-123") || sid.contentEquals("JLC-999")) {
			Student stu = new Student();
			stu.setSid(sid);
			stu.setBid("B-99");
			stu.setName("Yamini");
			stu.setEmail("yam@gmail.com");
			stu.setPhone("9999");
			model.addAttribute("STO", stu);
			result = "sidresults";
		} else {
			req.setAttribute("sidSearchCommand", sidSearchCommand);
			throw new StudentNotFoundException(sid);
		}
		return result;
	}

	/*
	 * @ExceptionHandler(StudentNotFoundException.class) public ModelAndView
	 * studentNotFound(StudentNotFoundException exe) {
	 * System.out.println("----Caught StudentNotFoundException----"); ModelAndView
	 * mav = new ModelAndView(); mav.addObject("msg",exe.getMessage());
	 * mav.setViewName("sidsearch"); return mav; }
	 */

	@ModelAttribute("sidSearchCommand")
	public SidSearchCommand createSidSearchCommand() {
		return new SidSearchCommand();
	}

	@RequestMapping(value = "/sidsearch.mvc")
	public String showSearchPage() throws ServletException {

		return "sidsearch";
	}

}
