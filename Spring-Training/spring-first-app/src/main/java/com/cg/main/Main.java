package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.HelloWorld;

public class Main {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		
		HelloWorld h1 =(HelloWorld)ctx.getBean("hello");

	
		System.out.println(h1.sayHello());
		System.out.println(h1.getLanguage());
	
		
		
		
		
		
		
	}
}
