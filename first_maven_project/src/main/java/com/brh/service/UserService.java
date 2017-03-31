package com.brh.service;

import com.brh.domain.User;

public interface UserService {
	
	public User getUserById(Integer userId);

	public void saveUser(User user);
}
