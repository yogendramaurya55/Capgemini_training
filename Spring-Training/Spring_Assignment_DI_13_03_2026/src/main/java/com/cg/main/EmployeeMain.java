package com.cg.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int EmployeeId = sc.nextInt();
		
		SBU e = (SBU) ctx.getBean("sbu");
		
		for(Employee emp :e.getEmpList()){
			if(emp.getEmployeeId() == EmployeeId) {
				emp.displayEmployeeDeatils();
			}
		}
		
		
		
	}
}
