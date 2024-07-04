package com.cjc.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.UserDetails;

@RestController
public class HomeController {
	
	@PostMapping("/saveUserData")
	public String SaveDataUser(@RequestBody UserDetails u)
	{
		System.out.println("Hello");
		return "SaveData";
	}

}
