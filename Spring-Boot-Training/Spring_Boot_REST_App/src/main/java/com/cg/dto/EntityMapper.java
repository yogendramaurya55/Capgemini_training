package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
	public static Employee covertObjectToEntity(EmployeeDTO edto) {
		return new Employee(edto.getFullName() , edto.getDateOfBirth() , edto.getSalary());
	}
	
	public static  EmployeeDTO covertEntityToDTO(Employee e) {
		return new EmployeeDTO(e.getEmpid() , e.getName() , e.getDob() , e.getSalary());
		
		
	}
}
