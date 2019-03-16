package com.gbn.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gbn.employee.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
			EmployeeDao transactionService = (EmployeeDao) context.getBean("employeeDao");
			transactionService.getEmployee();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
