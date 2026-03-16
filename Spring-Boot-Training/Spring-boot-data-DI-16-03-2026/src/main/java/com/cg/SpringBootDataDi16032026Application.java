package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

@SpringBootApplication
public class SpringBootDataDi16032026Application {
	
	@Bean
	@Primary
	public SBU sbu1() {
		SBU s = new SBU();
		s.setSbuId(1);
		s.setSbuName("java");
		s.setSbuHead("sahil");
		
		return s;
	}
	@Bean
	public Employee emp1() {
		Employee e = new Employee();
		
		e.setEmployeeId(2);
		e.setAge(22);
		e.setBusinessUnit(sbu1());
		e.setSalary(5000000);
		e.setEmployeeName("sameer");
		
		return e;
	}
	
	@Bean
	public Employee emp2() {
		Employee e = new Employee();
		
		e.setEmployeeId(2);
		e.setAge(22);
		e.setBusinessUnit(sbu1());
		e.setSalary(5000000);
		e.setEmployeeName("sameer");
		
		return e;
	}

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootDataDi16032026Application.class, args);
		
		SBU sbu = ctx.getBean(SBU.class);
		
		System.out.println(sbu);
		sbu.getEmpList().forEach(e -> e.displayEmployeeDeatils());
		
	}

}
