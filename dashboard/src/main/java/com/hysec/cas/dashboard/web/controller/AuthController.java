package com.hysec.cas.dashboard.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	@RequestMapping(value="signin.html")
    public String gotoSigninPage(HttpServletRequest request,HttpServletResponse response){
		
		return "signin";
	}
	
	@RequestMapping(value="signup.html")
    public String gotoSignupPage(HttpServletRequest request,HttpServletResponse response){
		
		return "signup";
	}
	
	@RequestMapping(value="blog.html")
    public String gotoBlogPage(HttpServletRequest request,HttpServletResponse response){
		
		return "blog";
	}
}
