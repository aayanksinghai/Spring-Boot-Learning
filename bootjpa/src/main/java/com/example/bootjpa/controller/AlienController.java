package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootjpa.model.Alien;
import com.example.bootjpa.repository.AlienRepository;

@Controller
public class AlienController
{
	@Autowired
	AlienRepository repo;
	
	@RequestMapping("/")
	private String home()
	{
		
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
}
