package com.jlc.spring.jdbc;

import java.util.List;

public interface CustomerDAO {

	public void addCustomer(CustomerTo cto);

	public void deleteCustomer(int cid);

	public void updateCustomer(CustomerTo cto);

	public List<CustomerTo> getAllCustomers();

	public CustomerTo getCustomerByCid(int cid);
}
