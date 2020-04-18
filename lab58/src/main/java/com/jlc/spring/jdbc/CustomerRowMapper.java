package com.jlc.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerTo> {

	public CustomerTo mapRow(ResultSet rs, int rowNum) throws SQLException {

		CustomerTo cto = new CustomerTo();
		cto.setCid(rs.getInt(1));
		cto.setCname(rs.getString(2));
		cto.setEmail(rs.getString(3));
		cto.setPhone(rs.getLong(4));
		cto.setCity(rs.getString(5));
		return cto;
	}

}
