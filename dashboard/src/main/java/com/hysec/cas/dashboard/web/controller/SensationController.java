package com.hysec.cas.dashboard.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SensationController {
	@RequestMapping(value="sensation.html")
    public String gotoSensationPage(HttpServletRequest request,HttpServletResponse response){
		
		return "sensation";
	}

}
