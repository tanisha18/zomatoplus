package com.thinkxfactor.zomatoplus.controller;


import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;

@RestController
@RequestMapping("/user")
public class UserController {

	

	@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		User user = new User();
		
		user.setPassword(password);
		user.setUsername(username);
	
		return user;
	}
	@GetMapping("/all")
	public List<User> userList() {
		List<User> users = new ArrayList<>();
		User u1,u2,u3;
		u1=new User("Arya","123456");
		u2=new User("Sheldon","Bazinga");
		u3=new User("Sansa","89uiyt");
		users.add(u1);
		users.add(u2);
		users.add(u3);
		return users;
	}
	@PostMapping("/create")
	public User userCreate(@RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}
	

}
