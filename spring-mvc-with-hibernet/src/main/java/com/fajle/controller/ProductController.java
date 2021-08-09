package com.fajle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fajle.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@GetMapping({ "/" })
	public String helloWorld(Model model) {
		model.addAttribute("name", productService.getName());
		return "index";
	}
}
