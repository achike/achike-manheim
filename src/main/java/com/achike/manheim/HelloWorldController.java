package com.achike.manheim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView mainPage() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", new Greeting());
		
		return mv;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView helloPage() {
		ModelAndView mv = new ModelAndView("hello");
		
		mv.addObject("message","Default Name");
		
		return mv;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView createGreeting(@ModelAttribute Greeting name) {
		ModelAndView mv = new ModelAndView("hello");
		
		mv.addObject("message", name.getName());
		
		return mv;
	}
}
