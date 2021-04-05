package com.Drammy.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Drammy.models.User;
import com.Drammy.models.Whiskey;

@Repository
public interface WhiskeyRepository extends JpaRepository<Whiskey, Integer> {
	
	Whiskey getWhiskeyByName(String name);
	
	Whiskey getWhiskeyByDistillery(String distillery);
	
	List<Whiskey> getAllWhiskeyByDistillery(String distillery);
	
	List<Whiskey> getAllWhiskeyByType(String type);
	
}
