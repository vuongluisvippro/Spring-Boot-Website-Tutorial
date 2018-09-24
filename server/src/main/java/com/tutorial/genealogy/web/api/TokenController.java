package com.tutorial.genealogy.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genealogy.model.JwtUser;
import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.security.JwtGenerator;
import com.tutorial.genealogy.service.UserService;

@SuppressWarnings("all")
@RestController
@RequestMapping("/token")
public class TokenController {
	
	private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {
        return jwtGenerator.generate(jwtUser);
    }
}
