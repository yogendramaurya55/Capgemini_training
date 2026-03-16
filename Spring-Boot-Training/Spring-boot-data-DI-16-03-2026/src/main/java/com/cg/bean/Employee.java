package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:data.properties")
public class Employee {
//	@Value(value = "${emp.id}")
	private int employeeId;
//	@Value(value = "${emp.name}")
	private String employeeName;
//	@Value(value = "${emp.salary}")
	private double salary;
//	@Autowired
//	private SBU businessUnit;
//	@Value(value = "${emp.age}")
	private int age;

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

//	public SBU getBusinessUnit() {
//		return businessUnit;
//	}
//
//	public void setBusinessUnit(SBU businessUnit) {
//		this.businessUnit = businessUnit;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public void displayEmployeeDeatils() {
//		System.out.println("Employee ID : " + employeeId);
//		System.out.println("Employee Name : " + employeeName);
//		System.out.println("Employee Salary : " + salary);
//		System.out.println("Employee BU : " + businessUnit);
//		System.out.println("Employee Age : " + age);
//
//	}
//	
//	

	public void displayEmployeeDeatils() {
		
		System.out.println("Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + "]");
		
//		getSbuDetails();
		
		

	}

//	public void getSbuDetails() {
//		System.out.println("sbu details = SBU [ subCode =" + businessUnit.getSbuId() + "sbuName = " + businessUnit.getSbuName() + "sbuHead = " + businessUnit.getSbuHead() + " ]");
//		
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
//				+ ", businessUnit=" + businessUnit + ", age=" + age + "]";
//	}
	
	
}
