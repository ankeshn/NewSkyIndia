package com.newskyindia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newskyindia.model.User;
import com.newskyindia.service.RegistrationService;

@RestController
public class RegistrationController {
	
	
	@Autowired
	private RegistrationService registrationService;
	
	
	
	      @PostMapping("/registeruser")
	      @CrossOrigin(origins="http://localhost:4200")
          public User registerUser(@RequestBody User user) throws Exception {
	    	  
	    	  String tempEmailid = user.getEmailid();
	    	  if (tempEmailid != null && !"".equals(tempEmailid)) {
	    		  User userObj = registrationService.fetchUserByEmailid(tempEmailid);   
	    		  
	    		  if(userObj != null) {
	    			  throw new Exception("User Exists");
	    		  }
	    	  }
	    	  
        	  User userObj=null;
        	  userObj = registrationService.saveUser(user);
        	  return userObj;
          }

	
	      
	      
	      
	      @PostMapping("/login")
	      @CrossOrigin(origins="http://localhost:4200")
	      public User loginUser(@RequestBody User user) throws Exception {
	    	  String tempEmailid = user.getEmailid();
	    	  String tempPassword = user.getPassword();
	    	  
	    	  User userObj=null;
	    	  if(tempEmailid!=null && tempPassword!=null) {
	    		  userObj = registrationService.fetchUserByEmailidAndPassword(tempEmailid, tempPassword);
	    		  }
	    	  
	    	  if(userObj==null) {
	    		  throw new Exception("Bad Credentials");
	    	  }
	    	  return userObj;
	    	  
	      }
	    
	      
	
}
