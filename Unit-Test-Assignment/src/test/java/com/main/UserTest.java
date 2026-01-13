package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void test() {
		User u=new User();
		assertNotNull(u.getUserName());
	}

}
