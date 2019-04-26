package com.douzone.dsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
	
	@RequestMapping("")
	public String test() {
//		System.out.println("@@@@");
		return "/WEB-INF/views/index.jsp";
	}
}
