package com.pluralsight.conference.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingController {

	@GetMapping("greeting")
	public String greeting(Map<String, Object> model)
	{
		model.put("message", "Hello Aayank");
		return "greeting";
	}
	
	@GetMapping("thyme")
	public String thyme(Map<String, Object> model)
	{
		model.put("message", "Hello ThymeAayank");
		return "thyme";
	}
}
