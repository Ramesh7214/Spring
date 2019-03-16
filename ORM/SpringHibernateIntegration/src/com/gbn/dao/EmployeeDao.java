package com.gbn.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.gbn.model.Employee;

public class EmployeeDao {
	
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveEmployee(Employee e){  
	    template.save(e); 
	}  
}
