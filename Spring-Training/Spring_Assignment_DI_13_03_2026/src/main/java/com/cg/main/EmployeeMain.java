package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e = (Employee) ctx.getBean("emp");
		e.displayEmployeeDeatils();
		
		
		
	}
}
