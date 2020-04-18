package com.spring.mvc;

public class StudentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String sid;

	public StudentNotFoundException(String sid) {
		this.sid = sid;
	}

	public String getMessage() {
		String msg = "Student Not Found";
		if (sid != null) {
			msg = "Student id " + sid + " not found";
		}
		return msg;
	}

	public String toString() {
		return getMessage();
	}

}
