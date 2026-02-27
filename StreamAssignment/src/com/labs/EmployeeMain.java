package com.labs;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println(EmployeeService.getTotalSalary());
		
		
		EmployeeService.getTotalEmpPerDept();
		
		System.out.println("------------------------------------------------------------------------");
		
		
		Employee e = EmployeeService.getSenior();
		
		System.out.println(e);
		
		System.out.println("------------------------------------------------------------------------");
		
		
		EmployeeService.getDuration();
		
		System.out.println("------------------------------------------------------------------------");
		
		EmployeeService.getEmpWithoutDepartment();
		
		System.out.println("------------------------------------------------------------------------");
		
		EmployeeService.getDepartmentEmpWithout();
		
		
		System.out.println("------------------------------------------------------------------------");
		
		System.out.print(EmployeeService.getCount().getDepartmentName());;
	}
}
