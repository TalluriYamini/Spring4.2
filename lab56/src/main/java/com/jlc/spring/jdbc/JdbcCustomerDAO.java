package com.jlc.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDAO implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemp;

	public void addCustomer(CustomerTo cto) {
		String sql = "insert into customers values(?,?,?,?,?)";
		jdbcTemp.update(sql, cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
	}

	public void deleteCustomer(int cid) {
		String sql = "delete from customers where cid = ?";
		jdbcTemp.update(sql, cid);
	}

	public void updateCustomer(CustomerTo cto) {
		String sql = "update customers set cname = ?,email=?,phone=?,city=? where cid = ?";
		jdbcTemp.update(sql, cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(), cto.getCid());
	}
}
