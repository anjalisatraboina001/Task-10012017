package com.anjali.tutorial.services;

import com.anjali.tutorial.entity.User;


public interface UserService {
	
	
	public User getUser(long userId);
	public User getUser(String email);
	public User addUser(String firstName,String lastName,String email,String sex,String password);

}
