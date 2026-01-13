package com.main;

public class DataPresent {
	public static boolean preseent(String file,String data) {
		if(file.contains(data))
			return true;
		return false;
	}
}
