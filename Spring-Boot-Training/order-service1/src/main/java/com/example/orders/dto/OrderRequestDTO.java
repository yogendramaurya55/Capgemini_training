package com.example.orders.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderRequestDTO {
	
	@NotNull(message = "customer  name cannot be empty")
	@Size(min = 3 , message = "name should be minimum 3 length")
	private String customerName;
	@NotNull(message = "email cannot be empty")
	@Email(message = "email should be in valid format")
	private String email;
	@NotNull(message = "product name cannot be empty")
	private String productName;
	@Min(value = 1 , message ="quantity must be greater than 0")
	@NotNull(message = "quatity cannot be empty")
	private int quantity;
	@Min(value = 1 , message = "price should be greater than 0")
	@NotNull(message = "price cannot be empty")
	private double pricePerUnit;
	

}
