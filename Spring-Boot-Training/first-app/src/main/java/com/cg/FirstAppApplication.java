package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;

@SpringBootApplication
@ComponentScan("com")
@PropertySource("classpath:data.properties")
public class FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(FirstAppApplication.class, args);
		
		
		Employee e = ctx.getBean(Employee.class);
		
		e.printDetails();
		
	}

}
