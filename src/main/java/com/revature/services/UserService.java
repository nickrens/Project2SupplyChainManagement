package com.revature.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.beans.Distributor;
import com.revature.beans.User;

public interface UserService {
	
	public User getUser(int id);
	
	public List<User> getRole(String name);
	
	public List<User> getUsers();
	
	public User addUser(User user);
	
	public User updateUser(User change);
	
	public boolean deleteUser(int id);
	
	public User login(String name, String password);
	
	public User validateUser(String username);
	

}
