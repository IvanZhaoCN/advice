package com.yfanz.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.yfanz.demo.exception.BuzzException;
import com.yfanz.demo.exception.FizzException;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(FizzException.class)
	public ResponseEntity<String> fizzExceptionHandler() {
		return new ResponseEntity<String>("fizz exception handler page", HttpStatus.OK);
	}

	@ExceptionHandler(BuzzException.class)
	public ResponseEntity<String> buzzExceptionHandler() {
		return new ResponseEntity<String>("buzz exception handler page", HttpStatus.OK);
	}

}
