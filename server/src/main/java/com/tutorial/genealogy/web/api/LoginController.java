package com.tutorial.genealogy.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.security.JwtGenerator;
import com.tutorial.genealogy.service.UserService;
import com.tutorial.genealogy.service.response.LoginResponse;

@SuppressWarnings("all")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService mUserService;
	
    @PostMapping
    public ResponseEntity generate(@RequestPart("username") String username) {
        return new ResponseEntity<>(mUserService.login(username), HttpStatus.OK);
    }
}

