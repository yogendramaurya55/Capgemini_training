package com.example.orders.exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.orders.dto.ErrorDTO;
import com.example.orders.dto.FeildErrorDTO;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponseWrapper;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseBody
	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorDTO handleException(OrderNotFoundException e ) {
		return new ErrorDTO(LocalDate.now() , "Order Not Found", HttpStatus.NOT_FOUND.value());
	}
	
	
	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public FeildErrorDTO handleException(MethodArgumentNotValidException e , HttpServletRequest req){
		List<ObjectError> errors = e.getBindingResult().getAllErrors();
		
		List<String> errorList = new ArrayList<>();
		
		for(ObjectError error : errors) {
			errorList.add(error.getDefaultMessage());
		}
		
		return new FeildErrorDTO(LocalDate.now(), errorList);
	}
	
    
}
