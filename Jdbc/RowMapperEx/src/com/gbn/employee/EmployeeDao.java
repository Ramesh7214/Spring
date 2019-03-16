package com.gbn.employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.gbn.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate template ;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void getEmployee(int eno) {
		Employee employee = template.queryForObject("select * from employee where eno = ?", new Object[] {eno},new EmployeeMapper());
		System.out.println(employee);
		
	}

	
	public void inserEmployee(Employee employee)
	{
		template.update("insert into employee(eno,ename,esalary) values(?,?,?)", new Object[] {employee.geteNo(),employee.geteName(),employee.geteSalary()});
	}
	
	public void creatTable()
	{
		template.execute("CREATE TABLE DEPARTMENT(DNO NUMBER, DNAME VARCHAR2(20))");
	}
	
	
	private final class EmployeeMapper implements RowMapper<Employee>
	{
		@Override
		public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Employee emp = new Employee();
			emp.seteNo(resultSet.getInt("eno"));
			emp.seteName(resultSet.getString("ename"));
			emp.seteSalary(resultSet.getInt("esalary"));
			
			return emp;
		}
	}
}
