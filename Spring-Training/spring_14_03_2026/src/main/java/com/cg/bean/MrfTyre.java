package com.cg.bean;

import org.springframework.stereotype.Component;

@Component("mrf")
public class MrfTyre implements ITyre{
	public String getTyreDetail() {
		return "mrf tyre";
	}
}
