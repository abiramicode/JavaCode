package com.example.ModelandViewUsingHtml;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {
	
	@RequestMapping("/abi")
	public ModelAndView display()
	{
		return new ModelAndView("abi");
	}
	
	@RequestMapping("/practice")
	public ModelAndView display1()
	{
		return new ModelAndView("practice");
	}
	
//   @RequestMapping("/control")
//	public ModelAndView display2()
//	{
//		return new ModelAndView("control");
//	}
		
}
