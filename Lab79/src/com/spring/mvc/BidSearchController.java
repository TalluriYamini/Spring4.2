package com.spring.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("bidSearchCommand")
public class BidSearchController {

	@Autowired
	private BidValidator sidValidator;

	@RequestMapping(value = "/searchStudent.mvc", method = RequestMethod.POST)
	public String searchStudent(@ModelAttribute("bidSearchCommand") BidSearchCommand bidSearchCommand,
			BindingResult errors, Model model, HttpServletRequest req) throws ServletException {
		String result = "bidsearch";
		System.out.println("searchStudent");
		sidValidator.validate(bidSearchCommand, errors);
		if (errors.hasErrors()) {
			System.out.println(errors.getErrorCount());
			return result;
		}

		String bid = bidSearchCommand.getBid();
		System.out.println(bid);
		if (bid.equals("B-12") || bid.contentEquals("B-99")) {
			Student stu = new Student();
			stu.setSid("JLC-123");
			stu.setBid(bid);
			stu.setName("Yamini");
			stu.setEmail("yam@gmail.com");
			stu.setPhone("9999");

			List<Student> sList = new ArrayList<Student>();
			sList.add(stu);
			sList.add(stu);
			sList.add(stu);
			sList.add(stu);
			sList.add(stu);
			model.addAttribute("SLIST", sList);
			result = "bidresults";
		} else {
			errors.reject("bid", "bid.notfound");
		}
		return result;
	}

	@ModelAttribute("bidSearchCommand")
	public BidSearchCommand createSidSearchCommand() {
		return new BidSearchCommand();
	}

	@RequestMapping(value = "/bidsearch.mvc")
	public String showSearchPage() throws ServletException {

		return "bidsearch";
	}

}
