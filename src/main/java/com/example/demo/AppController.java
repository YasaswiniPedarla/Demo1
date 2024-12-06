package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AppController {
	
	@Autowired
	DAO dao ;
	
	@GetMapping("/")
	public String fun1() {
		return "Welcome";
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public String fun2(@RequestBody User user) {
		return "Data Inserted " + dao.insertUser(user);
	}
	
	@GetMapping("/all")
	public String fun3() {
		return dao.reterieveAll().toString();
	}
	
	@GetMapping("/email")
	public String fun4(@RequestParam("email") String email) {
		return dao.findUser(email).toString();
	}

}
