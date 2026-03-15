package com.cg.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.HelloWorld;
import com.cg.cfg.javaConfig;

public class HelloMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(javaConfig.class);
		
		
		HelloWorld h = ctx.getBean(HelloWorld.class);
		HelloWorld h1 = ctx.getBean(HelloWorld.class);
		
		h.setName("rohan");
		
		System.out.println(h.equals(h1));
		System.out.println(h1);
	}
}
