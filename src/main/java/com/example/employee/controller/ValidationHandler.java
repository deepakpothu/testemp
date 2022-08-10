package com.example.employee.controller;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		Map<String,String> errors=new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach(error->{
			String FieldName=((FieldError)error).getField();
			String msg=error.getDefaultMessage();
			errors.put(FieldName, msg);
		});
		
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
		
	
	}
	
	
	@ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        String details = ex.getMessage();
        return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
    }
}

