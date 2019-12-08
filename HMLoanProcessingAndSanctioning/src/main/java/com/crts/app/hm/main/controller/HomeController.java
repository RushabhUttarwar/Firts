package com.crts.app.hm.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.hm.main.service.Iservice;

@RestController
public class HomeController {

	@Autowired
	Iservice ser;
	
	@RequestMapping("/gethmpls")
	public String getHmlps() {
		return "Hi! You are in HMLPS";
	}
}
