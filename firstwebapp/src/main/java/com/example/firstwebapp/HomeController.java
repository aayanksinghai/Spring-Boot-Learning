package com.example.firstwebapp;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{
	@RequestMapping("home")
	public ModelAndView Home(Alien alien)
	{	
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		
		return mv;
	}
}
