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
public class LoginService {
	
	private JwtGenerator mJwtGenerator;
	
	private final UserRepository mUserRepository;
	
	public LoginService(JwtGenerator jwtGenerator, UserRepository userRepository) {
		mJwtGenerator = jwtGenerator;
		mUserRepository = userRepository;
	}
	
	public LoginResponse checkLogin(String username) {
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
	
	private static class HTTPCodeResponse {
		private static final int SUCCESS = 0;
		private static final int OBJECT_NOT_FOUND = 302;
	}
}

