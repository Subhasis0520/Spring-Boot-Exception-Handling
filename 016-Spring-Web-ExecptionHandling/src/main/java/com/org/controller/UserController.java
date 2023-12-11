package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user(Model model) {
		int[] a = {1,2,3};
		System.out.println(a[6]);
		model.addAttribute("msg","User class..");
		return "index";
	}
}
