package com.tutorial.genealogy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.repository.UserRepository;
import com.tutorial.genealogy.security.JwtGenerator;
import com.tutorial.genealogy.service.response.LoginResponse;
import com.tutorial.genealogy.service.response.MessageResponse;

@Service
@Transactional
public class UserService {
	
	private JwtGenerator mJwtGenerator;
	
	private final UserRepository mUserRepository;
	
	public UserService(JwtGenerator jwtGenerator, UserRepository userRepository) {
		mUserRepository = userRepository;
		mJwtGenerator = jwtGenerator;
	}
	
    public LoginResponse checkLogin(User user) {
    	mUserRepository.save(user);
    	
        MessageResponse messageResponse = new MessageResponse();
        
        messageResponse.setCode(0);
        messageResponse.setDescription("Success");
        LoginResponse loginResponse = new LoginResponse(messageResponse, mJwtGenerator.generate(user));
        return loginResponse;
    }
}
