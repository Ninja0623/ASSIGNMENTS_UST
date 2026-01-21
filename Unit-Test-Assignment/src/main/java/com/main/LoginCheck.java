package com.main;

public class LoginCheck {
	public static boolean login(String email,String password) {
		if(email.equalsIgnoreCase("admin") && password.equals("admin123"))
			return true;
		return false;
	}
}
