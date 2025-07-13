package com.management.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.app.model.User;
import com.management.app.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("save")
	User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("get-all")
	List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("get-one/{id}")
	User getOneUser(@PathVariable Long id){
		return userService.getOneUser(id);
	}
}
