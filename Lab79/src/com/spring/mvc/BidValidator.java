package com.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BidValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return BidSearchCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		BidSearchCommand sidSearchCommand = (BidSearchCommand) command;
		String bid = sidSearchCommand.getBid();
		if (bid == null || bid.length() == 0) {
			errors.rejectValue("bid", "errors.bid.required");
		} else if (!bid.startsWith("B-")) {
			errors.rejectValue("bid", "errors.bid.format");
		} else {
			try {
				String temp = bid.substring(2);
				int x = Integer.parseInt(temp);
				if (x < 10 || x > 99) {
					errors.rejectValue("bid", "errors.bid.integer");
				}
			} catch (Exception e) {
				errors.rejectValue("bid", "errors.bid.integer");
			}
		}

	}

}
