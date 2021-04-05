package com.Drammy.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Drammy.models.User;
import com.Drammy.repo.UserRepository;
import com.Drammy.service.UserService;
import com.Drammy.service.WhiskeyService;

@Controller
public class TestController {
	
	@Autowired
	UserService userService;
	WhiskeyService whiskeyService;
	
	@RequestMapping("/")
	public ModelAndView indexHandler() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
	
	@PostMapping("/signInAttempt")
	public ModelAndView signInAttempt(HttpServletRequest request) {
		String inputUsername = request.getParameter("username");
		String inputPassword = request.getParameter("password");
		ModelAndView mav = new ModelAndView();
		
		User user = userService.getUserByUsername(inputUsername);
//		System.out.println("User: " + user.getUsername() + " " + user.getPassword());
//		System.out.println(inputUsername + " " + inputPassword);
		
		if (user != null && user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
			mav.setViewName("userProfile");
			mav.addObject(user);
			return mav;
			
		} else {
			mav.setViewName("signIn");
			return mav;
		}
	}
	
	@PostMapping("/createAccount")
	public ModelAndView createAccountHandler(HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView("userProfile");
		User user = new User(
				request.getParameter("username"),
				request.getParameter("firstName"),
				request.getParameter("lastName"),
				request.getParameter("password"));
		userService.addUser(user);
		mav.addObject(user);
		return mav;
	}
	
	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
}
