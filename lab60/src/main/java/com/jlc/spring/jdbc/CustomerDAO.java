package com.jlc.spring.jdbc;

import java.util.List;

public interface CustomerDAO {

	public void addCustomer(final CustomerTo cto);

	public List<CustomerTo> getAllCustomers();
}
