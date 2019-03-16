package com.gbn.model;

public class Employee {

	private int eNo;
	private String eName;
	private int eSalary;

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "Employee no : "+eNo+", Employee name : "+eName+", Employee Salary : "+eSalary;
	}

}
