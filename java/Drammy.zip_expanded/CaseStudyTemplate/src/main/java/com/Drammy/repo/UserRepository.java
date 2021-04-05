package com.Drammy.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Drammy.models.User;
import com.Drammy.models.Whiskey;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	void addUser(User user);
//	
//	User getUserByUsername(String username);
//	
//	void deleteByUsername(String username);
//	
//	//void changePassword(String username);
//	
//	//List<User> allUsers();
//	
//	List<Whiskey> savedWhiskey(String username);
//	
//	List<Whiskey> wantedWhiskey(String username);
	
}
