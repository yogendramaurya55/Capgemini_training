package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "${emp.id}")
	private int empid;
	@Value(value = "${emp.name}")
	private String name;
//	@Autowired
	private Address address;
	
	
	
	
//	public Employee() {
//		super();
//	}
//	

	public Employee(Address address) {
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getEmployeeDetails() {
		System.out.println("empid : " + empid);
		System.out.println("name : " + name);
		System.out.println("city : " + address.getCity());
		System.out.println("country : " + address.getCountry());
		System.out.println("zip : " + address.getZip());
	}
}
