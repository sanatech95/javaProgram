package com.OPPs2.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		super(name);
		System.out.println("Employee Constructor");
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char grade) {
		this.employeeGrade = employeeGrade;

	}


	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
	}
}
