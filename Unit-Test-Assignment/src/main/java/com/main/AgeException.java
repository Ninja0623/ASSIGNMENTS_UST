package com.main;

public class AgeException {
	public static void check(int age) {
		if(age<0)
			throw new IllegalArgumentException("Age cannot be negative");
	}
}
