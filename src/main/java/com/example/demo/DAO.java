package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAO {
	@Autowired
	UserInterface repo;
	
	public User insertUser(User user) {
		return repo.save(user);
	}
	
	public List<User> reterieveAll(){
		return repo.findAll();
	}
	
	public User findUser(String email) {
		return repo.findByEmail(email);
	}

}
