package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {
	
	@GetMapping("status/{name}")
	public  String sayHello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	

}
