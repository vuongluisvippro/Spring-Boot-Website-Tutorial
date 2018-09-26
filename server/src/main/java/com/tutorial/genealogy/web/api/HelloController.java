package com.tutorial.genealogy.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.service.UserService;

@SuppressWarnings("all")
@RestController
@RequestMapping("/rest/hello")
public class HelloController {
	
	@Autowired
	private UserService mUserService;
	
	@GetMapping()
	public String hello() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String temp = "";
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    temp = authentication.getName();
		}
		return temp;
	}
}
