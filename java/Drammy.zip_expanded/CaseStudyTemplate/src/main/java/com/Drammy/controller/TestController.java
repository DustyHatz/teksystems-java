package com.Drammy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
}
