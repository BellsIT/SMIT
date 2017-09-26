package com.smit.service;


import java.util.List;

import com.smit.model.User;

public interface UserService {
	
	User findById(Long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();
	List<User> fetchAll();
	List<User> findAllUsers();

	boolean isUserExist(User user);
}