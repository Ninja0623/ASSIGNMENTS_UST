package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidateTest {

	@Test
	public void testEmailValidate() {
		EmailValidate e=new EmailValidate();
		assertTrue(e.validate("admin@gmail.com"));
	}
}
