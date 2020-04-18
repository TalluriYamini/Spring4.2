package com.jlc.spring.hibernate;

import java.util.List;

public interface CustomerDAO {

	public List<CustomerTo> getAllCustomers();

	public String getCustomerCityByEmail(String email);

	public int getCustomersCount();

	public List<CustomerTo> getCustomersByCity(String city);

	public CustomerTo getCustomerByEmail(String email);

	public Long getCustomerPhoneByEmail(String email);

}
