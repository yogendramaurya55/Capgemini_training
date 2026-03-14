package com.cg.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.SBU;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		SBU e = (SBU) ctx.getBean("sbu");
		
		System.out.println(e);
		
		e.getEmpList().forEach(System.out::println);
		
	}
}
