package com.brh.dao;

import com.brh.domain.User;

public interface UserDao {
	public User getUserById(Integer userId);

	public void saveUser(User user);
}
