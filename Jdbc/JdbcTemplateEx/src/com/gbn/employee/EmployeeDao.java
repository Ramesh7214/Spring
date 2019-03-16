package com.gbn.employee;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void getEmployee(int eno) {
		List employee = template.queryForList("select * from employee where eno = ?", new Object[] {eno });
		System.out.println(employee);

		/*String str = template.queryForObject("select ename from employee where eno = ?", new Object[] { 1 },
				String.class);
		System.out.println(str);*/
	}

}
