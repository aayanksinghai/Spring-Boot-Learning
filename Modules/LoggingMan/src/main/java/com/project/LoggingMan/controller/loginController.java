package com.project.LoggingMan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.LoggingMan.model.User;
import com.project.LoggingMan.repository.userRepository;

@Controller
public class loginController 
{
	@Autowired
	private userRepository repo;
	
	@RequestMapping(value = "/login")
	public String index()
	{
		return "login";
	}	
	
	@GetMapping(value = "/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/register")
	public String addUser(User user)
	{
		repo.save(user);
		System.out.println(user.getName() + " " + user.getCity() + " " +user.getEmail()
		+ " " + user.getPassword());
		
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(User user)
	{
		String u = user.getEmail();
		String pass = user.getPassword();
		if(repo.existsByEmail(u))
		{
			if(repo.existsByPassword(pass))
			{
				return "welcome";
			}
			else
			{
				System.out.println("Password not match");
			}
		}
		else
		{
			System.out.println("Email not match");
		}
		return "login";
	}
	
}
