package com.goldfish.datastar.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// in28minutes, dummy
		
		
		return (userid.equalsIgnoreCase("goldfish")
				&& password.equalsIgnoreCase("goldfish"))
			  || (userid.equalsIgnoreCase("goldfish-datastar")
						&& password.equalsIgnoreCase("goldfish-datastar"))
			  || (userid.equalsIgnoreCase("test")
						&& password.equalsIgnoreCase("test"))
				;
	}

}