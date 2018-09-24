package com.tutorial.genealogy.web.api;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.service.LoginService;
import com.tutorial.genealogy.service.RegisterService;

@SuppressWarnings("all")
@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private RegisterService mRegisterService;
	
    @PostMapping
    public ResponseEntity generate(@RequestBody final User user) {
        return new ResponseEntity<>(mRegisterService.registerUser(user), HttpStatus.OK);
    }
}

