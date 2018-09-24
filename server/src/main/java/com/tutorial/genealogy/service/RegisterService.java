package com.tutorial.genealogy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.repository.UserRepository;
import com.tutorial.genealogy.service.response.LoginResponse;
import com.tutorial.genealogy.service.response.MessageResponse;

@Service
@Transactional
public class RegisterService {
	
	private final UserRepository mUserRepository;
	
	public RegisterService(UserRepository userRepository) {
		mUserRepository = userRepository;
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

