package com.jlc.spring.jdbc;

public interface CustomerDAO {
	public void addCustomer(CustomerTo cto);

	public void deleteCustomer(int cid);

	public void updateCustomer(CustomerTo cto);
}
