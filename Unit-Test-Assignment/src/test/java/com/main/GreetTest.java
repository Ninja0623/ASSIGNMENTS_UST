package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetTest {

	@Test
	public void test() {
		Greet g=new Greet();
		assertEquals("Welcome, User",g.greet("User"));
	}

}
