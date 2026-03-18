package com.cg;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;

@SpringBootApplication
public class SpringBootDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootDataAppApplication.class, args);
				EmployeeService service = ctx.getBean(EmployeeService.class);
		
		
//		System.out.println(service.createEmployee(new Employee("Rohan", LocalDate.of(2002, 3, 1), 500000)));
//		System.out.println(service.createEmployee(new Employee("Aman", LocalDate.of(1999, 7, 12), 450000)));
//		System.out.println(service.createEmployee(new Employee("Priya", LocalDate.of(2001, 5, 21), 520000)));
//		System.out.println(service.createEmployee(new Employee("Neha", LocalDate.of(1998, 11, 3), 600000)));
//		System.out.println(service.createEmployee(new Employee("Rahul", LocalDate.of(2000, 2, 15), 480000)));
//		System.out.println(service.createEmployee(new Employee("Sneha", LocalDate.of(1997, 9, 30), 550000)));
//		System.out.println(service.createEmployee(new Employee("Smith", LocalDate.of(2002, 3, 30), 550000)));
		
		
		System.out.println(service.findByEmpSalary(50000000));
				
				
	    System.out.println(service.findEmpByMonth(2002, 03));
		
		
	}

}
