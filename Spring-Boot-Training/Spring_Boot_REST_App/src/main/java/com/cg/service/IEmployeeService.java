package com.cg.service;

import java.util.List;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFound;

public interface IEmployeeService {
	
	public List<EmployeeDTO> getAllEmployees();
	public EmployeeDTO createEmployee(EmployeeDTO emp);
	public EmployeeDTO getEmployee(int id) throws EmployeeNotFound;
	public String removeEmployee(int id);
	public EmployeeDTO updateEmployee(EmployeeDTO emp) throws EmployeeNotFound;
	public List<EmployeeDTO> findEmpByName(String name);
	
	
}
