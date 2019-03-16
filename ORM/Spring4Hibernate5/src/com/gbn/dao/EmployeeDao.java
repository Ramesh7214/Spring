package com.gbn.dao;

import java.util.List;

import com.gbn.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	public void addEmployee(Employee emp);

}
