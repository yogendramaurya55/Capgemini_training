package com.cg.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
/**
 * Employee entity representing the employee table.
 */
public class Employee {
	@Id
	private String empid;
	private String name;
	// email of employee
	private String email;
	private String dob;

	// default constructor required by JPA
	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}

	// parameterized constructor
	public Employee(final String name, final String email, final String dob) {
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(final String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(final String dob) {
		this.dob = dob;
	}

}