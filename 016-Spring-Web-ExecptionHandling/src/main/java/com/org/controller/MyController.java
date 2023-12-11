package com.org.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	private Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/greet")
	public String greet(Model model) {
		int a = 10/0;
		model.addAttribute("msg","Good evening..!");
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg","Hello everyone..");
		return "index";
	}
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		String s = null;
		s.length();
		model.addAttribute("msg","Welcome Sir...!");
		return "index";
	}
	/*
	 *       Local handler
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception e) {
		String message = e.getMessage();
		logger.error(message);
		return "errorPage";
	}
	*/
}
