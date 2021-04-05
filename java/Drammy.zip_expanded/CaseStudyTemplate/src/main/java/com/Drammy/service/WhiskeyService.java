package com.Drammy.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Drammy.models.User;
import com.Drammy.models.Whiskey;
import com.Drammy.repo.WhiskeyRepository;

@Service
public class WhiskeyService {
	
	@Autowired
	WhiskeyRepository whiskeyRepository;
	
	public Whiskey getWhiskeyByName(String name) {
		return whiskeyRepository.getWhiskeyByName(name);
	}
	
	public List<Whiskey> getAllWhiskeyByType(String type) {
		List<Whiskey> whiskies = whiskeyRepository.getAllWhiskeyByType(type);
		return whiskies;
	}
	
	public List<Whiskey> getAllWhiskeyFromDistillery(String distillery) {
		List<Whiskey> whiskies = whiskeyRepository.getAllWhiskeyByDistillery(distillery);
		return whiskies;
	}


	
}
