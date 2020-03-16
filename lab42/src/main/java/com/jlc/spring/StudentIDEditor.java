package com.jlc.spring;

import java.beans.PropertyEditorSupport;

public class StudentIDEditor extends PropertyEditorSupport {
	public void setAsText(String txt) {
		String p1 = txt.substring(0, 3);
		String p2 = txt.substring(4);
		StudentID sid = new StudentID(Integer.parseInt(p2), p1);
		this.setValue(sid);
	}
}
