package com.gbn.employee;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.gbn.model.Employee;

public class EmployeeDao {

	private NamedParameterJdbcTemplate template;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public void getEmployee(int eno) {
		//List employee = template.queryForList("select * from employee where eno = ?", new Object[] { eno });
		//System.out.println(employee);

	}

	public void inserEmployee(Employee employee) {
		String query = "insert into employee(eno,ename,esalary) values(:eno,:ename,:esalary)";
		Map map = new HashMap();
		map.put("eno", employee.geteNo());
		map.put("ename", employee.geteName());
		map.put("esalary", employee.geteSalary());
		SqlParameterSource params = new MapSqlParameterSource().addValues(map);
		template.update(query, params);
	}

}
