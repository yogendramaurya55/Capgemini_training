package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeeNotFound;

@Service
public class EmployeeService implements IEmployeeService{
	
//	@Autowired
	private IEmployeeRepo repo;
	
	public EmployeeService(IEmployeeRepo repo) {
		super();
		this.repo = repo;
	}
	

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeDTO> emps = new ArrayList<>();
		try {
			repo.findAll().forEach(e -> {
				emps.add( EntityMapper.covertEntityToDTO(e));
			});
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		try {
			repo.saveAndFlush(EntityMapper.covertObjectToEntity(emp));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public EmployeeDTO getEmployee(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = repo.findById(id);
		
		if(emp.isPresent()) {
			Employee e = emp.get();
			return EntityMapper.covertEntityToDTO(e);
		}else {
			throw new EmployeeNotFound("Employee not found");
		}
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
	public EmployeeDTO updateEmployee(Integer id ,EmployeeDTO emp) {
		// TODO Auto-generated method stub
		Employee e = repo.findById(id).orElse(null);
		
		if(emp.getFullName() != null) {
			e.setName(emp.getFullName());
		}
		
		if(emp.getDateOfBirth() != null) {
			e.setDob(emp.getDateOfBirth());
		}
		
		if(emp.getSalary() != null) {
			e.setSalary(emp.getSalary());;
		}
		
		
		Employee res = repo.saveAndFlush(e);
		
		EmployeeDTO dto = EntityMapper.covertEntityToDTO(res);
		
		return dto;
	}

	@Override
	public List<EmployeeDTO> findEmpByName(String name) {
		List<EmployeeDTO> emps = new ArrayList<>();
		try {
	
			repo.findByName(name).forEach(e -> {
				emps.add(EntityMapper.covertEntityToDTO(e));
			});
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return emps;
	}
}
