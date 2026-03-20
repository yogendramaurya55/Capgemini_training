package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {

	private Integer employeeId;
	@NotNull(message = "name is required")
	@NotBlank(message = "name should not be blank")
	private String fullName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dateOfBirth;
	@NotNull(message = "salary is requored ")
	@Min(value = 500000)
	private Double salary;

	

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Integer id, String fullName, LocalDate dateOfBirth, Double salary) {
		this.employeeId = id;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
