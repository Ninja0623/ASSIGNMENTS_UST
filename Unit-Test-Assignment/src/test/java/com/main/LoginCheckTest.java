package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginCheckTest {

	@Test
	public void testLogin() {
		LoginCheck log=new LoginCheck();
		assertTrue(log.login("admin", "admin123"));
	}
	@Test
	public void testFalseLogin() {
		LoginCheck log=new LoginCheck();
		assertTrue(log.login("admn", "admin123")); //Email changed
	}
}
