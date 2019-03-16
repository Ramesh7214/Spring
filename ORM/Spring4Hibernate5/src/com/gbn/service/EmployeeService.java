package com.gbn.service;

import java.util.List;

import com.gbn.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void addEmployee(Employee emp);

}
