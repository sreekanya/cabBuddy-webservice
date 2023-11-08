package com.cabBuddy.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	//Query Parameters(@RequestParam)
	@RequestMapping(value="/",method = RequestMethod.GET)
	@ResponseBody
	public String indexMapping() {
		return "Hello, Server is up and running";
	}
	
	//Path Variables
	@RequestMapping(value="/resource/{userId}",method = RequestMethod.GET)
	@ResponseBody
	public String getUser(@PathVariable int userId) {
		return "Hello, User ID is :"+userId;
	}

	//Request Body
	@RequestMapping(value="/data", method= RequestMethod.POST)
	@ResponseBody
	public Object submitData(@RequestBody Object data) {
		return data;
	}
	
	//Request Header
	@RequestMapping(value="/head", method= RequestMethod.POST)
	@ResponseBody
	public Object submitHeader(@RequestHeader Object head) {
		return head;
	}
	
}
