package com.cg.service;

import java.util.List;

import com.cg.entity.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee emp);
	public Employee getEmployee(int id);
	public String removeEmployee(int id);
	public Employee updateEmployee(Employee emp);
	public List<Employee> findEmpByName(String name);
	
	
}
