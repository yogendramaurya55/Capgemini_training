package com.cg.service;

import java.util.List;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;

public interface IEmployeeService {
	
	public List<EmployeeDTO> getAllEmployees();
	public EmployeeDTO createEmployee(EmployeeDTO emp);
	public EmployeeDTO getEmployee(int id);
	public String removeEmployee(int id);
	public EmployeeDTO updateEmployee(EmployeeDTO emp);
	public List<EmployeeDTO> findEmpByName(String name);
	
	
}
