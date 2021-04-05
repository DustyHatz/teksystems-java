package com.Drammy.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Drammy.models.User;
import com.Drammy.models.Whiskey;
import com.Drammy.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

		
	public void addUser(User user) {
		
		if (user != null) {
			
			userRepository.save(user);
		}
	}
	
//	public User getUserByusername(String username) {
//		
//		Optional<User> user = userRepository.findById(username);
//		
//		return user.orElse(null);
//	}
//	
//	/*
//	public void changePassword(String username) {
//		
//	}
//	*/
//	
//	public void deleteUserByUsername(String username) {
//		userRepository.deleteByUsername(username);
//	}
//	
//	/* public List<User> allUsers() {
//		List<User> allUsers = userRepository.findAll();
//		
//		if (!allUsers.isEmpty()) {
//			return allUsers;
//		} else {
//			System.out.println("No users found...");
//			return null;
//		}
//	}
//	*/
//	
//	public List<Whiskey> savedWhiskey(String username) {
//		// TODO
//		return null;
//	}
//	
//	public List<Whiskey> wantedWhiskey(String username) {
		// TODO
//		return null;
//	}
	
	
}
