package com.gbn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gbn.dao.EmployeeDao;
import com.gbn.model.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		
		Employee emp = new Employee();
		emp.seteNo(7);
		emp.seteName("Karthik");
		emp.seteSalary(15000);
		
		employeeDao.saveEmployee(emp);
		
	}
}
