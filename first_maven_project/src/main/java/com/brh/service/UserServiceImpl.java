package com.brh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brh.dao.UserDao;
import com.brh.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserById(Integer userId) {

		return userDao.getUserById(userId);
	}

	public void saveUser(User user) {

		userDao.saveUser(user);
	}

}
