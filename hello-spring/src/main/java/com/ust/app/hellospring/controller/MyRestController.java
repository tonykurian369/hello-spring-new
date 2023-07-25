package com.ust.app.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.hellospring.model.customer;
import com.ust.app.hellospring.model.customer1;

@RestController
public class MyRestController {
	
	@GetMapping
	public String sayHello() {
		return "Hello World.......ust";
	}
	@GetMapping("/hello/{Username}")
	public String greet(@PathVariable String Username)
	{
		return "hi iam " +Username;
	}
	@GetMapping("/Customer")
	public customer employee()
	{
		customer c= new customer(101,"tony","tonykurian");
		return c;
		
	}
	@PostMapping("/customer")
	public customer addcustomer(@RequestBody customer customer)
	{
		return customer;
		
	}
}
