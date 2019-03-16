package com.gbn.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gbn.config.MyAppConfig;
import com.gbn.model.Employee;
import com.gbn.service.EmployeeService;

public class AppTest {
	
	public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(MyAppConfig.class);

	      EmployeeService employeeService = context.getBean(EmployeeService.class);

	      // Add employee
	      employeeService.addEmployee(new Employee(null, "rajiv", 5845));

	      // Get Users
	      List<Employee> employees = employeeService.getAllEmployees();
	      for (Employee emp : employees) {
	         System.out.println("Employee no = "+emp.geteNo());
	         System.out.println("Employee Name = "+emp.geteName());
	         System.out.println("Employee Salary = "+emp.geteSalary());
	         System.out.println();
	      }

	      context.close();
	   }
}
