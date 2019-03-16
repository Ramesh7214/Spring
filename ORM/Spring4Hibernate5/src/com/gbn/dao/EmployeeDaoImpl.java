package com.gbn.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gbn.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> query= sessionFactory.getCurrentSession().createQuery("from com.gbn.model.Employee");
		return query.getResultList();
	}

	@Override
	public void addEmployee(Employee emp) {
		sessionFactory.getCurrentSession().save(emp);
		
	}

}
