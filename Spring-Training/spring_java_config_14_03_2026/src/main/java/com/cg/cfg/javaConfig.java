package com.cg.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;

@Configuration
@PropertySource("classpath:data.properties")
public class javaConfig {
	@Bean
	@Scope("prototype")
	public HelloWorld getBean() {
		return new HelloWorld();
	}
	
	
	@Bean
	public Employee emp1() {
		return new Employee();
	}
	
	@Bean
	public Employee emp2() {
		return new Employee();
	}
	
	@Bean
	public Address getBean2() {
		return new Address();
	}
}
