package com.cg.dto;

public class TraineeDTO {
	private int id;
	private String name;
	private String domain;
	private String loc;
	
	
	public TraineeDTO() {
		super();
	}
	public TraineeDTO( String name, String domain, String loc) {
		super();
		this.name = name;
		this.domain = domain;
		this.loc = loc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
