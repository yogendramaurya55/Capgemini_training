package com.cg.exception;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.dto.ErrorDTO;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ResponseBody
	@ExceptionHandler(EmployeeNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorDTO handleException(EmployeeNotFound e , HttpServletRequest req) {
		return new ErrorDTO(e.getMessage() , LocalDate.now() , req.getRequestURI());
	}
	
	
	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public Map<String , ErrorDTO> handleException(MethodArgumentNotValidException e , HttpServletRequest req){
		
		List<ObjectError> errors = e.getBindingResult().getAllErrors();
		Map<String , ErrorDTO> map = new HashMap<>();
		
		
		for(ObjectError error : errors){
            String fieldName = ((FieldError) error).getField();
            map.put(fieldName, new ErrorDTO(error.getDefaultMessage(), LocalDate.now(), req.getRequestURI()));
        }
		
		return map;
	}
	
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorDTO handleException(Exception e , HttpServletRequest req){
		
		return new ErrorDTO(e.getMessage() , LocalDate.now() , req.getRequestURI());
	}
}
