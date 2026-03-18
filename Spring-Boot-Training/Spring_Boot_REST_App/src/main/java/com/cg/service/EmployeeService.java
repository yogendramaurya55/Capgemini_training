package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IEmployeeRepo;
import com.cg.entity.Employee;

@Service
public class EmployeeService implements IEmployeeService{
	
//	@Autowired
	private IEmployeeRepo repo;
	
	public EmployeeService(IEmployeeRepo repo) {
		super();
		this.repo = repo;
	}
	

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emps = null;
		try {
			emps = repo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			repo.saveAndFlush(emp);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = null;
		try {
			emp = repo.findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return emp.get();
	}

	@Override
	public String removeEmployee(int id) {
		// TODO Auto-generated method stub
		
		try {
			if(getEmployee(id) != null) {
			repo.deleteById(id);
			}
		} catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
		}
		
		return "successfully deleted";
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(getEmployee(emp.getEmpid()) != null) {
		return repo.saveAndFlush(emp);
		}
		
		return null;
	}

	@Override
	public List<Employee> findEmpByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> emps = null;
		try {
	
			emps = repo.findByName(name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}
}
