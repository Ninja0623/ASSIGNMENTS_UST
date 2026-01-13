package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidateTest {

	@Test
	public void testPasswordValidate() {
		PasswordValidate p=new PasswordValidate();
		assertTrue(p.validate("12345678"));
	}

}
