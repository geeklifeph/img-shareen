package com.shareen.img.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// shareen, img
		return userid.equalsIgnoreCase("shareen")
				&& password.equalsIgnoreCase("img");
	}
}
