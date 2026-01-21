package com.main;

public class PasswordValidate {
	public static boolean validate(String s) {
		if(s.length()>=8)
			return true;
		return false;
	}
}
