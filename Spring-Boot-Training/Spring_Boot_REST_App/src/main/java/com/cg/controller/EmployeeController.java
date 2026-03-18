package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
	
//	@Autowired
	private IEmployeeService service;
	
	public EmployeeController(IEmployeeService service) {
		this.service = service;
	}
	
	@GetMapping("employees/{id}")
	public Employee getEmploye(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/get-all-emps")
	public List<Employee> getAllEmplyee(){
		return service.getAllEmployees();
	}
	
	@GetMapping("get-emp-by-name/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name ){
		return service.findEmpByName(name);
	}
	
	@PostMapping("create-emp")
	public Employee createEmp(@RequestBody Employee emp) {
		 return service.createEmployee(emp);
	}
	
	
	@DeleteMapping("delete-emp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.removeEmployee(id);
	}
	
	@PutMapping("update-emp")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
}
