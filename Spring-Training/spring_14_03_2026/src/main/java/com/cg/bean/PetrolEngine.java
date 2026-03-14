package com.cg.bean;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine  implements IEngine{
	public String getBHP() {
		return "150";
	}
}
