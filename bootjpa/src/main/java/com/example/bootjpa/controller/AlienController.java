package com.example.bootjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.bootjpa.model.Alien;
import com.example.bootjpa.repository.AlienRepository;

@RestController
public class AlienController
{
	@Autowired
	AlienRepository repo;
	
	@RequestMapping("/")
	private String home()
	{
		
		return "home.jsp";
	}

	/*
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	*/
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAliens(@PathVariable int aid)
	{ 
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
		
	}
	
	@GetMapping(path="/alien")
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	
	@PutMapping(path="/alien", consumes = {"application/json"})
	public Alien updateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	/*
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	*/
	
	/*
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam int aid)
	{
		
		repo.deleteById(aid);
		return "delete.jsp";
	}*/
	
	/*
	@RequestMapping("/updateAlien")
	public String updateAlien(@RequestParam int aid, Alien alien)
	{
		repo.deleteById(aid);
		repo.save(alien);
		return "update.jsp";
	}
	*/
		
}

