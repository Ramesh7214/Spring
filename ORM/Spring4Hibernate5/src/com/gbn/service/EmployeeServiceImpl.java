package com.gbn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbn.dao.EmployeeDao;
import com.gbn.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	

	@Transactional
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}


	@Transactional
	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
		
	}
}
