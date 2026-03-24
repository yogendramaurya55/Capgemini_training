package com.example.orders.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeildErrorDTO {
	private LocalDate timestamp;
	private List<String> errors;
	
	
	public FeildErrorDTO(LocalDate timestamp, List<String> errors) {
		super();
		this.timestamp = timestamp;
		this.errors = errors;
	}
	
	
}
