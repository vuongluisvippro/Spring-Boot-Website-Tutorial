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

	public MessageResponse registerUser(User user) {
		try {
			mUserRepository.save(user);
			return viewMessage("You have been successfully registered");
		} catch(Exception ex) {
			return viewMessage("Failed to create account");
		}
	}
	
	public LoginResponse checkLogin(User user) {
    	mUserRepository.save(user);
    	
        MessageResponse messageResponse = new MessageResponse();
        
        messageResponse.setCode(HTTPCodeResponse.SUCCESS);
        messageResponse.setDescription("Success");
        LoginResponse loginResponse = new LoginResponse(messageResponse, mJwtGenerator.generate(user));
        return loginResponse;
    }
	
	private MessageResponse viewMessage(String message) {
		MessageResponse messageResponse = new MessageResponse();
        messageResponse.setCode(HTTPCodeResponse.SUCCESS);
        messageResponse.setDescription(message);
        return messageResponse;
	}
	
	private static class HTTPCodeResponse {
		private static final int SUCCESS = 0;
	}
}

