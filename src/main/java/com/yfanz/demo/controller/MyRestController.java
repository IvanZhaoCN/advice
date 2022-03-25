package com.yfanz.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yfanz.demo.exception.BuzzException;
import com.yfanz.demo.exception.FizzException;

@RestController
public class MyRestController {
	
	@RequestMapping(path = "/api/{id}")
	public ResponseEntity<String> handle(@PathVariable("id") String id) {
		System.out.println(id);
		if (id.equals("fizz")) {
			throw new FizzException("msg", "reason");
		}else if (id.equals("buzz")) {
			throw new BuzzException("msg", "reason");
		}else {
			return new ResponseEntity<String>("invalid page", HttpStatus.FORBIDDEN);
		}
		
		
	}
}
