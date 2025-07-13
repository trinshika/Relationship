package com.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.app.dao.UserIRepo;
import com.management.app.model.User;

@Service
public class UserService {

	
	@Autowired
	UserIRepo userIRepo;
	
	
	public User createUser(User user) {
		return userIRepo.save(user);
	}
	
	public List<User> getAllUser(){
		return userIRepo.findAll();
	}
	
	public User getOneUser(Long id){
		return userIRepo.findById(id).get();
	}
}
