package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static String text = "Hello, %s!";
	private AtomicLong counter = new AtomicLong();
	
	@GetMapping("/details")
	public Greeting greeting(@RequestParam(value= "name", defaultValue = "World") String name)
	{
		return new Greeting(counter.incrementAndGet(),String.format(text, name));
	}

}
