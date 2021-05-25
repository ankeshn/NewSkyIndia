package com.newskyindia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.newskyindia.model.User;
import com.newskyindia.repo.RegistrationRepository;

@Service
public class RegistrationService {

	
	@Autowired
	private RegistrationRepository registrationRepository;
   
	public User saveUser(User user) {
	
	   return registrationRepository.save(user);
   }
	
	public User fetchUserByEmailid(String email) {
		return registrationRepository.findByEmailid(email);
	}

	
	public User fetchUserByEmailidAndPassword(String email, String password) {
		return registrationRepository.findByEmailidAndPassword(email, password);
	}
}
