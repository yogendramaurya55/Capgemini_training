package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cg.bean.Employee;
import com.cg.cfg.javaConfig;

public class EmployeeMain {
	public static void main(String[] args)  {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(javaConfig.class);
				
		Employee emp = ctx.getBean(Employee.class);
		
		emp.getEmployeeDetails();
		
	}
}
