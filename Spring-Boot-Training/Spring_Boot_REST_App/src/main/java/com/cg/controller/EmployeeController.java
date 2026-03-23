package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFound;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("employee")
@Tag(name = "EmployeeApi" , description = "This provide the crud operation with employee entity")
public class EmployeeController {
	
//	@Autowired
	private IEmployeeService service;
	
	public EmployeeController(IEmployeeService service) {
		this.service = service;
	}
	
	@Operation(summary = "this is used to get employee with the employee id ")
	@GetMapping("get/{id}")
	public ResponseEntity<EmployeeDTO> getEmploye(@PathVariable int id) throws EmployeeNotFound {
		EmployeeDTO e = service.getEmployee(id);
		if(e != null) {
			return new ResponseEntity<EmployeeDTO>(e , HttpStatus.OK);
		}
		return new ResponseEntity<EmployeeDTO>( e , HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value ="get-all" , produces = {"application/xml", "application/json"} )
	public List<EmployeeDTO> getAllEmplyee(){
		
		return service.getAllEmployees();
	}
	
	@GetMapping(value ="get-by-name/{name}" , produces = {"application/xml", "application/json"} )
	public List<EmployeeDTO> getEmployeeByName(@PathVariable String name ){
		return service.findEmpByName(name);
	}
	
	@PostMapping(value ="create" , produces = {"application/xml", "application/json"} , consumes = {"application/xml", "application/json"})
	public EmployeeDTO createEmp(@RequestBody @Valid EmployeeDTO emp) {
		 return service.createEmployee(emp);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return service.removeEmployee(id);
	}
	
	@PutMapping(value ="update/{id}" , produces = {"application/xml", "application/json"} , consumes = {"application/xml", "application/json"})
	public EmployeeDTO updateEmployee(@PathVariable Integer id ,@RequestBody EmployeeDTO emp){
		return service.updateEmployee(id , emp);
	}
}
