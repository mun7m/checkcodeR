package com.demo.springbootdemo1312.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemo1312.services.TestService;


@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestService testservice;
	
	@GetMapping("/get")
	public String call() {
		
		testservice.print();
		
		return "hello ram";
		
		
	}
	
	
			
	
	
	
	
	
}