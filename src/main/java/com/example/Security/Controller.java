package com.example.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
	
//	@GetMapping("/all")
//	public String helloAll() {
//		return "Hello";
//	}
	@GetMapping("/alls")
	public String helloAlls() {
		return "Hellos";
	}
	
	
	
	@PostMapping("/add")
	public User add(@RequestBody User user) {
		System.out.println(user.getUsername() + user.getPassword());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
}
