package com.gbn.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployeeDao {
	
	private DriverManagerDataSource datasource;
	
	public void setDatasource(DriverManagerDataSource datasource) {
		this.datasource = datasource;
	}

	Connection con;

	public void getEmployee() throws SQLException {

		try {
			con =datasource.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			con.close();
		}
	}
}
