package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActiveTest {

	@Test
	public void test() {
		Active a=new Active();
		assertTrue(a.isActive());
	}

}
