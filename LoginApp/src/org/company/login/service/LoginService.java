package org.company.login.service;

import java.util.HashMap;

import org.company.login.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	 
	public LoginService() {
		users.put("ayehia", "test123");
		users.put("aessam", "test123");
		users.put("gahmed", "test123");
	}
	
	public boolean authenticate(String userId, String password) {
		if(password ==null || password.trim() == "") {
			return false;
		}
		return true;
		
		
	}
	
	public User getuserDetails(String userId) {
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		
		return user;
	}

}
