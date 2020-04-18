package com.jlc.spring;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.annotation.Resource;
import javax.sql.DataSource;

import com.mysql.jdbc.PreparedStatement;

public class TestService {

	@Resource(name = "mysqlDS")
	private DataSource mysqlDS;

	public void showMysSQLInfo() {

		try {
			Connection myCon = mysqlDS.getConnection();
			DatabaseMetaData mydbmd = myCon.getMetaData();
			System.out.println(mydbmd.getDatabaseProductName());
			System.out.println(mydbmd.getDefaultTransactionIsolation());
			String query = "insert into sample (name) "
					+ "values (?)";
			PreparedStatement ps = (PreparedStatement) myCon.prepareStatement(query);
			ps.setString(1, "qwertyuiop");
			ps.execute();
			myCon.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
