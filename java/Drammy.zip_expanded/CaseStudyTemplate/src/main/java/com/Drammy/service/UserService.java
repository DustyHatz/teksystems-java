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

		
	public User addUser(User user) {
		User addedUser =  userRepository.save(user);
		return addedUser;
	}
	
	public User getUserByUsername(String username) {
		
		Optional<User> user = userRepository.findById(username);
		
		return user.orElse(null);
	}
		
	public void deleteUserByUsername(String username) {
		userRepository.deleteByUsername(username);
	}
	
	public void updateSavedWhiskey(String username, Whiskey whiskey) {
		
		User user = userRepository.getOne(username);
		
		List<Whiskey> currentSavedWhiskey = user.getSavedWhiskey();
		currentSavedWhiskey.add(whiskey);
		user.setSavedWhiskey(currentSavedWhiskey);
		
		userRepository.save(user);
		
		
	}
	
//	public List<Whiskey> addTastedWhiskey(int whiskeyId) {
//		// TODO
//		return null;
//	}
//	
//	public List<Whiskey> addWantedWhiskey(int whiskeyId) {
//		// TODO
//		return null;
//	}
//	
//	public List<Whiskey> showSavedWhiskey(String username) {
//		
//		User user = userRepository.getOne(username);
//		
//		return user.getSavedWhiskey();
//		
//	}
	
	
	
}
