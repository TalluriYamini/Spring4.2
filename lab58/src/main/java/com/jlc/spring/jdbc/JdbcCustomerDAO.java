package com.jlc.spring.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemp;

	public List<CustomerTo> getAllCustomers() {
		String sql = "select * from customers";
		List list = jdbcTemp.query(sql, new CustomerRowMapper());
		return list;
	}

	public int getCustomerCount() {
		String sql = "select count(*) from customers";
		return jdbcTemp.queryForObject(sql, Integer.class);
	}

	public CustomerTo getCustomerByCid(int cid) {
		String sql = "select * from customers where cid = ?";
		CustomerTo cto = (CustomerTo) jdbcTemp.queryForObject(sql, new CustomerRowMapper(),cid);
		return cto;
	}

	public List<CustomerTo> getCustomersByCity(String city) {
		String sql = "select * from customers where city = ?";
		List list = jdbcTemp.query(sql, new CustomerRowMapper(), city);
		return list;
	}

	public CustomerTo getCustomerByEmail(String email) {
		String sql = "select * from customers where email = ?";
		CustomerTo cto = jdbcTemp.queryForObject(sql, new CustomerRowMapper(), email);
		return cto;
	}

	public String getCustomerCityByEmail(String email) {
		String sql = "select city from customers where email = ?";
		String city = (String) jdbcTemp.queryForObject(sql, String.class, email);
		return city;
	}

	public Long getCustomerPhoneByEmail(String email) {
		String sql = "select phone from customers where email = ?";
		Long ph = (Long) jdbcTemp.queryForObject(sql, Long.class, email);
		return ph;
	}

	
}
