package com.example.Security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = "password";
		System.out.println(passwordEncoder().encode(pass));
		System.out.println(System.getProperty("user.dir"));
		

	}
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
