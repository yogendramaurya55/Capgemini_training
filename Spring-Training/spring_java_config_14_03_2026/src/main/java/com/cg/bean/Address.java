package com.cg.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value(value = "${add.city}")
	private String city;
	@Value(value = "${add.country}")
	private String country;
	@Value(value = "${add.zip}")
	private int zip;
	
	
	
	
	public Address() {
		super();
	}
	public Address(String city, String country, int zip) {
		super();
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
