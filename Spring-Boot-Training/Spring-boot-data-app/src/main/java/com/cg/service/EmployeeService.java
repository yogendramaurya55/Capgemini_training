package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private IEmployeeRepo repo;

	public String createEmployee(Employee e) {
		try {
			repo.save(e);
			
		} catch (Exception e2) {
			e2.getStackTrace();
		}
		
		return "Employee created";
		
	}
	
	public Employee getEmployeeById(int id) {
		Optional<Employee> e = Optional.ofNullable(new Employee());
		try {
			e = repo.findById(id);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		return e.get(); 
	}
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> emps = null;
		
		try {
			emps = repo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return emps;
	}
	
	
	public String updateEmployee(Employee e) {
		try {
			repo.saveAndFlush(e);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		return "Employee details updated successfully";
	}
	
	public String removeEmployee(int id) {
		if(getEmployeeById(id) != null) {
			repo.deleteById(id);
		}else {
			return "Employee not found";
		}
		
		return "Employee deleted successfully";
	}
	
	
	public List<Employee> findEmpByName(String name) {
		List<Employee> emps = null;
		try {
			emps = repo.findByNa(name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}
	
	
	public List<Employee> findByEmpSalary(int sal){
		List<Employee> emps = null;
		try {
			emps = repo.findBySalary(sal);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}
	
	public List<Employee> findEmpByMonth(int year , int month){
		List<Employee> emps = null;
		try {
			emps = repo.findByBirthMonth(year, month);
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		return emps;
	}
}
