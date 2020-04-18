package com.jlc.spring.hibernate;

import java.util.List;

public interface CustomerDAO {

	public void addCustomer(CustomerTo cto);

	public void deleteCustomer(int cid);

	public List<CustomerTo> getAllCustomers();

	public void updateCustomer(CustomerTo cto);

	public CustomerTo getCustomerByCid(int cid);

}
