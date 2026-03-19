package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tarineeId;
	private String taineeName;
	private String traineeDomain;
	private String tarineeLocation;

	public Trainee() {
		super();
	}

	public Trainee(String taineeName, String traineeDomain, String tarineeLocation) {
		super();
		this.taineeName = taineeName;
		this.traineeDomain = traineeDomain;
		this.tarineeLocation = tarineeLocation;
	}

	public int getTarineeId() {
		return tarineeId;
	}

	public void setTarineeId(int tarineeId) {
		this.tarineeId = tarineeId;
	}

	public String getTaineeName() {
		return taineeName;
	}

	public void setTaineeName(String taineeName) {
		this.taineeName = taineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTarineeLocation() {
		return tarineeLocation;
	}

	public void setTarineeLocation(String tarineeLocation) {
		this.tarineeLocation = tarineeLocation;
	}

}
