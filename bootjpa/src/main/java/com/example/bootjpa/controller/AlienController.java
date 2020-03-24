package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens()
	{
		return repo.findAll().toString();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlien(@PathVariable("aid") int aid)
	{
		
		return repo.findById(aid).toString();
		
		
		
	}
	
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam int aid)
	{
		
		repo.deleteById(aid);
		return "delete.jsp";
	}
	
	@RequestMapping("/updateAlien")
	public String updateAlien(@RequestParam int aid, Alien alien)
	{
		repo.deleteById(aid);
		repo.save(alien);
		return "update.jsp";
	}
	
		
}

