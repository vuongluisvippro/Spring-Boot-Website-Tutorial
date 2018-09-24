package com.tutorial.genealogy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.repository.UserRepository;
import com.tutorial.genealogy.security.JwtGenerator;
import com.tutorial.genealogy.service.response.LoginResponse;
import com.tutorial.genealogy.service.response.MessageResponse;

@Service
public class UserService {
	
	private JwtGenerator mJwtGenerator;
	
	private final UserRepository mUserRepository;
	
	public UserService(JwtGenerator jwtGenerator, UserRepository userRepository) {
		mJwtGenerator = jwtGenerator;
		mUserRepository = userRepository;
	}
	
	@Transactional
	public LoginResponse login(String username) {
		MessageResponse messageResponse = new MessageResponse();
		User user = mUserRepository.findUserEntityByUsername(username);
		if (user == null) {
	        messageResponse.setCode(HTTPCodeResponse.OBJECT_NOT_FOUND);
	        messageResponse.setDescription("Wrong Information");
	        return new LoginResponse(messageResponse, null);
		} else {
			messageResponse.setCode(HTTPCodeResponse.SUCCESS);
	        messageResponse.setDescription("Success");
	        return new LoginResponse(messageResponse, mJwtGenerator.generate(user));
		}
    }
	
	public LoginResponse registerUser(User user) {
		MessageResponse messageResponse = new MessageResponse();
		try {
			mUserRepository.save(user);			
	        messageResponse.setCode(HTTPCodeResponse.SUCCESS);
	        messageResponse.setDescription("You have been successfully registered");
	        return new LoginResponse(messageResponse, null);
		} catch(Exception ex) {
	        messageResponse.setCode(HTTPCodeResponse.OBJECT_NOT_FOUND);
	        messageResponse.setDescription("Failed to create account");
	        return new LoginResponse(messageResponse, null);
		}
	}
	
	private static class HTTPCodeResponse {
		private static final int SUCCESS = 0;
		private static final int OBJECT_NOT_FOUND = 302;
	}
}

