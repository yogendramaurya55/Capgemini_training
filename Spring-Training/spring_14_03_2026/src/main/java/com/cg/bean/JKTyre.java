package com.cg.bean;

import org.springframework.stereotype.Component;

@Component("jk")
public class JKTyre implements ITyre{
	public String getTyreDetail() {
		return "jk Tyre";
	}

	
}
