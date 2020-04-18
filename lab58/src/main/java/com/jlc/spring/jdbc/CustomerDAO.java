package com.jlc.spring.jdbc;

import java.util.List;

public interface CustomerDAO {

	public List<CustomerTo> getAllCustomers();

	public int getCustomerCount();

	public CustomerTo getCustomerByCid(int cid);

	public List<CustomerTo> getCustomersByCity(String city);

	public CustomerTo getCustomerByEmail(String email);

	public String getCustomerCityByEmail(String email);

	public Long getCustomerPhoneByEmail(String email);
}
