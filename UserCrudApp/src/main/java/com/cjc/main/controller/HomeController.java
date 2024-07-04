package com.cjc.main.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

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
	@GetMapping("/users")
	public ResponseEntity<List<UserDetails>> getAllUsers()
	{
		return new ResponseEntity<>(null,HttpStatus.OK);

	}

}
