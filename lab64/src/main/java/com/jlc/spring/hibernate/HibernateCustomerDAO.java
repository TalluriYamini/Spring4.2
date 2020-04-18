package com.jlc.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemp;

	public List<CustomerTo> getAllCustomers() {
		List<CustomerTo> ctoList = new ArrayList<CustomerTo>();
		String hql = "from Customer c";
		List<Customer> cl = (List<Customer>) hibernateTemp.find(hql);
		for (Customer customer : cl) {
			CustomerTo cto = new CustomerTo(customer.getCid(), customer.getCname(), customer.getEmail(),
					customer.getPhone(), customer.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public String getCustomerCityByEmail(String email) {
		String hql = "from Customer c where c.email = ?";
		List<Customer> cl = (List<Customer>) hibernateTemp.find(hql, email);
		Customer c = (Customer) cl.get(0);
		return c.getCity();
	}

	public int getCustomersCount() {
		String hql = "from Customer c";
		List<Customer> cl = (List<Customer>) hibernateTemp.find(hql);
		return cl.size();

	}

	public List<CustomerTo> getCustomersByCity(String city) {
		List<CustomerTo> ctoList = new ArrayList<CustomerTo>();
		String hql = "from Customer c where c.city = :city";
		List<Customer> cl = (List<Customer>) hibernateTemp.findByNamedParam(hql, "city", city);
		for (Customer customer : cl) {
			CustomerTo cto = new CustomerTo(customer.getCid(), customer.getCname(), customer.getEmail(),
					customer.getPhone(), customer.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public CustomerTo getCustomerByEmail(String email) {
		String hql = "from Customer c where c.email = :email";
		List<Customer> cl = (List<Customer>) hibernateTemp.findByNamedParam(hql, "email", email);
		Customer customer = (Customer) cl.get(0);
		CustomerTo cto = new CustomerTo(customer.getCid(), customer.getCname(), customer.getEmail(),
				customer.getPhone(), customer.getCity());
		return cto;

	}

	public Long getCustomerPhoneByEmail(String email) {
		String hql = "from Customer c where c.email = :email";
		List<Customer> cl = (List<Customer>) hibernateTemp.findByNamedParam(hql, "email", email);
		Customer customer = (Customer) cl.get(0);
		return customer.getPhone();
	}

}
