package com.cg.pl;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es=new EmployeeService();
		String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
		System.out.println(result);
		
		
		//find the employee with empid
		Employee  r = es.findById("Ram11929");
		System.out.println(r);
		
		//get all the employees
		List<Employee> ls = es.getAllEmployee();
		System.out.println(ls);
		
		
		System.out.println(es.updateEmployeeName("Ram11929", "shyam"));
		
		System.out.println(es.removeEmployee("Ram11929"));

	}

}