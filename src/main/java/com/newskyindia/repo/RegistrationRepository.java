package com.newskyindia.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newskyindia.model.User;

public interface RegistrationRepository extends MongoRepository<User,Integer> {
	
                  public User findByEmailid(String emailid); 
                  
                  public User findByEmailidAndPassword(String emailid, String password); 
	

}
