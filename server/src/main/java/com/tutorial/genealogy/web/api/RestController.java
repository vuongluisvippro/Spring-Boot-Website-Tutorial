package com.tutorial.genealogy.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.service.UserService;

@SuppressWarnings("all")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService mUserService;
	
	@GetMapping("/")
	public String hello() {
		return "This is Home Page";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username, @RequestParam String password, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age) {
		User user = new User(username, password, firstname, lastname, age);
		mUserService.saveUser(user);
		return "User Saved";
	}
}
