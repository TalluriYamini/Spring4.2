package com.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SidValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		return SidSearchCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object command, Errors errors) {
		SidSearchCommand sidSearchCommand = (SidSearchCommand) command;
		String sid = sidSearchCommand.getSid();
		if (sid == null || sid.length() == 0) {
			errors.rejectValue("sid", "errors.sid.required");
		} else if (!sid.startsWith("JLC")) {
			errors.rejectValue("sid", "errors.sid.format");
		} else {
			try {
				String temp = sid.substring(4);
				int x = Integer.parseInt(temp);
				if (x < 100 || x > 999) {
					errors.rejectValue("sid", "errors.sid.integer");
				}
			} catch (Exception e) {
				errors.rejectValue("sid", "errors.sid.integer");
			}
		}

	}

}
