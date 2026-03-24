package com.example.orders.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ErrorDTO {
	
	private LocalDate timestamp;
	private String message;
	private int status;
	
	
	public ErrorDTO(LocalDate timestamp, String message, int status) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
	}
	
	
}
