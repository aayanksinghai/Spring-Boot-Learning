package com.pluralsight.conference.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conference.model.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstname", defaultValue = "Aayank") String firstname,
	@RequestParam(value = "lastname", defaultValue = "Singhai") String lastname,
	@RequestParam(value = "age", defaultValue = "20") int age)
	
	{
		User user = new User();
		user.setFirstname(firstname);
		user.setAge(age);
		user.setLastname(lastname);
		return user;
	}

	
	@PostMapping("/user")
	public User postUser(User user)
	{
		System.out.println("User firstname: " + user.getFirstname());
		return user;
		
	}
}
