package com.gbn.employee;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDao extends JdbcDaoSupport{
	
	public void getEmployee(int eno) {
		List employee = getJdbcTemplate().queryForList("select * from employee where eno = ?", new Object[] {eno});
		System.out.println(employee);
		
	}
}
