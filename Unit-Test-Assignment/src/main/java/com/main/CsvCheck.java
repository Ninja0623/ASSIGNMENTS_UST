package com.main;

public class CsvCheck {
	public static boolean csvCheck(String filename) {
		if(filename.endsWith(".csv"))
			return true;
		return false;
	}
}
