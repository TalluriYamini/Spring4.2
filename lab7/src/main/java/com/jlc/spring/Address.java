package com.jlc.spring;

public class Address {
	private String city;
	private String state;
	private String street;

	public Address(String city, String state, String street) {
		System.out.println("Address-3 arg");
		this.city = city;
		this.state = state;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String toString() {
		return "" + city + "\t" + street + "\t" + state;
	}
}
