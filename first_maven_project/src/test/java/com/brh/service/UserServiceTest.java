package com.brh.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.brh.baseTest.SpringTestCase;
import com.brh.domain.User;

public class UserServiceTest extends SpringTestCase{
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getUserByIdTest(){
		User user = userService.getUserById(1);
		System.out.println(user.getUserName()+" : "+user.getUserPassword());
	}
	
	@Test
	public void saveUser(){
		User user = new User();
		user.setUserName("guoyunlai");
		user.setUserPassword("abcd123");
		
		userService.saveUser(user);
		System.out.println("save success!");
	}
}
