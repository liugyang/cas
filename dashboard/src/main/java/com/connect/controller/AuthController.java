package com.connect.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connect.model.dao.StockManager;

@Controller
public class AuthController {
	
	@Autowired
	private StockManager stockManager;
	
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
