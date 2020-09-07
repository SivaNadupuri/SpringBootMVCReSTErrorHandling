package com.error.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_IMPLEMENTED)
public class EmployeeNotFoundExeception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundExeception() {
		super();
	}
	
	public EmployeeNotFoundExeception(String msg) {
		super(msg);
	}

}
