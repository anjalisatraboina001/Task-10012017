package com.anjali.tutorial.dao;

import com.anjali.tutorial.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDAO {

	
	public User addUser(User user);
	public User getUser(long userId);
	public User getUser(String email);
}
