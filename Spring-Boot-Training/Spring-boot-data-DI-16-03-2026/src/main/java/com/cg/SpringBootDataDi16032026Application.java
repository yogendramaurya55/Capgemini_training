package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cg.bean.Employee;

@SpringBootApplication
public class SpringBootDataDi16032026Application {
	


	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootDataDi16032026Application.class, args);
		
		Employee emp = ctx.getBean(Employee.class);
		
		emp.displayEmployeeDeatils();
		
	}

}
