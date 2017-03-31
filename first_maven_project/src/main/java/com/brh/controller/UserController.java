package com.brh.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brh.domain.User;
import com.brh.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(value="/index.do",method=RequestMethod.GET)
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		User user = userService.getUserById(1);
		mav.addObject("user", user);
		System.out.println("user");
		return mav;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(User user){
		ModelAndView mav = new ModelAndView();
		userService.saveUser(user);
		mav.setViewName("success");
		mav.addObject("msg","user = "+user);
		return mav;
	}
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String toSave(){
		 
		return "input";
	}
}
