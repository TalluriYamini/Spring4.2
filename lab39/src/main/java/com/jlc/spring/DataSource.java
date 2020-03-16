package com.jlc.spring;

public class DataSource {

	private String driverClass;
	private String url;
	private String username;
	private String password;
	private int min;
	private int max;
	private int timeout;

	public String getDriverClass() {
		return driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String toString() {
		return "" + driverClass + "\n" + url + "\n" + username + "\n" + password + "\n" + min + "\n" + max + "\n"
				+ timeout;
	}
}
