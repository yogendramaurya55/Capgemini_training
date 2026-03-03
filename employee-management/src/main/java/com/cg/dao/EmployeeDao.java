package com.cg.dao;

import java.util.List;

import com.cg.bean.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeeDao implements IEmployeeDao{
	private static EntityManagerFactory emf ;
	private static EntityManager em ;
	static {
		emf = Persistence.createEntityManagerFactory("my-pu");
		em = emf.createEntityManager();
	}
	@Override
	public String saveEmployee(Employee emp) {
//		
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(emp);
			tx.commit();
			return"Employee created successfully";
			
		}catch(Exception e) {
			if(tx.isActive()) {
				tx.rollback();
			}
			return "Employee not created";
			
		}
	}

	@Override
	public Employee findEmployee(String empid) {
		
		try {
			Employee emp =  em.find(Employee.class, empid);
			
			return emp;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		try {
			Query q = em.createQuery("select e from Employee e");
			List<Employee> emps = q.getResultList();
			
			return emps;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	

	@Override
	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Employee emp = em.find(Employee.class, empid);
			if(emp != null) {
				em.remove(emp);
				tx.commit();
				return "Employee deleted successfully";
			}else {
				
				return "Invalid employee id";
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return "transaction failed";
		}
		
		
	}

	@Override
	public String updateEmployeeName(String empid, String newName) {
		// TODO Auto-generated method stub
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			Employee emp = em.find(Employee.class, empid);
			if(emp == null) {
				return "Invalid Employee id";
			}
			emp.setName(newName);
			tx.commit();
			
			return "Successfully updated the employee data";
		}catch(Exception e) {
			e.printStackTrace();
			return "transaction failed";
		}
		
	}

}