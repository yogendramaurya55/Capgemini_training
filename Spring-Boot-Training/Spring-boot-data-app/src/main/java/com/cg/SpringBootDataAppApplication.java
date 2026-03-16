package com.cg;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;

@SpringBootApplication
public class SpringBootDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootDataAppApplication.class, args);
		
		IEmployeeRepo erepo =  ctx.getBean(IEmployeeRepo.class);
		
		erepo.save(new Employee("yogendra" , LocalDate.of(2002, 12, 1) , 500000));
		
	}

}
