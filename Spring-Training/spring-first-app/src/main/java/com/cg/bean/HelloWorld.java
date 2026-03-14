package com.cg.bean;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	private String name;
	private Set<String> language;

	public String sayHello() {
		return "Hello " + this.name;
	}

//	public HelloWorld() {
//		super();
//	}
//
//
//	public HelloWorld(String name) {
//		super();
//		this.name = name;
//	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getLanguage() {
		return language;
	}

	public void setLanguage(Set<String> language) {
		this.language = language;
	}

}
