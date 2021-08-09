package com.fajle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fajle.model.User;
import com.fajle.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
//	UserService userService = new UserService();

	List<String> gender = new ArrayList<String>();
	List<String> homeDisList = new ArrayList<String>();

	public void init() {
		// Service business logic
		gender.clear();
		homeDisList.clear();
		gender.add("Male");
		gender.add("Female");
		gender.add("Other");

		homeDisList.add("Dhaka");
		homeDisList.add("Cumilla");
		homeDisList.add("Feni");
		homeDisList.add("Chadpur");
		homeDisList.add("Foridpur");
		homeDisList.add("Rajbari");
	}

	@RequestMapping("/")
	public String helloWorld(Model model) {
//		model.addAttribute("name", userService.getName());
		return "index";
	}

	@GetMapping("/reg-form")
	public String form(Model model) {

		init();
		model.addAttribute("gender", gender);
		model.addAttribute("homeDisList", homeDisList);
		model.addAttribute("user", new User());
		return "regFrom";
	}

	@RequestMapping(method = RequestMethod.POST, value = { "/save" })
	public String save(Model model, @ModelAttribute("user") User user) {

		userService.save(user);
		model.addAttribute("user", user);
		System.out.println(user.getGender());
		return "regDetails";
	}
	
	@RequestMapping("/all-users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "allUser";
    }

}
