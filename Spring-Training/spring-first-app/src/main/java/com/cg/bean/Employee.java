package com.cg.bean;

public class Employee {
	private int empid;
	private String name;
	private Address address;
	
	
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, Address address) {
		super();
		this.empid = empid;
		this.name = name;
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
