package com.jlc.spring;

import java.util.List;

import javax.annotation.Resource;

public class Student {

	@Resource
	StudentID sid;

	String sname;
	long phone;

	@Resource
	Fee fee;

	@Resource
	List<String> emails;

	@Resource
	List<Long> phones;

	public StudentID getSid() {
		return sid;
	}

	public void setSid(StudentID sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Long> getPhones() {
		return phones;
	}

	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}

}
