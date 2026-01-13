package com.main;

public class EmailValidate {
	public static boolean validate(String email) {
		if(email.contains("@"))
			return true;
		return false;
	}
}
