package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.org.service.ProductService;

@Controller
public class ProductController {
	

	@Autowired
	private ProductService service;
	
	@GetMapping("/product")
	public String product(Model model) {
		String nameById = service.getNameById(100);
		model.addAttribute("msg", nameById);
		return "index";
	}
}
