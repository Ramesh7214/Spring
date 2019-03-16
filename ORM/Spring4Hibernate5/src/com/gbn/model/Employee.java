package com.gbn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer eNo;

	@Column(name = "ENAME")
	private String eName;

	@Column(name = "ESALARY")
	private Integer eSalary;

	public Integer geteNo() {
		return eNo;
	}

	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer geteSalary() {
		return eSalary;
	}

	public void seteSalary(Integer eSalary) {
		this.eSalary = eSalary;
	}
	
	public Employee(Integer eNo, String eName, Integer eSalary)
	{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary= eSalary;
	}
	
	public Employee() {
	}

}
