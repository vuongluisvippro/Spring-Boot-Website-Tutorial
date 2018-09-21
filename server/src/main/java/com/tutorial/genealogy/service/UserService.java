package com.tutorial.genealogy.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tutorial.genealogy.model.User;
import com.tutorial.genealogy.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository mUserRepository;
	
	public UserService(UserRepository userRepository) {
		mUserRepository = userRepository;
	}
	
	public void saveUser(User user) {
		mUserRepository.save(user);
	}
}
