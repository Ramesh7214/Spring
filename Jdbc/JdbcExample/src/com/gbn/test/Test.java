package com.gbn.test;

import java.sql.SQLException;

import com.gbn.employee.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		
		try {
			new EmployeeDao().getEmployee();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
