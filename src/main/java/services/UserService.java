package services;

import java.util.List;

import entity.User;

public interface UserService {

	//create a user
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get single user using userId
	
	User getUser(String userId);
	
	//TODO: delete
	//TODO: update
	
}
