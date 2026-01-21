package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest {

	@Test
	public void test() {
		StringLength s=new StringLength();
		assertEquals(4,s.str("java"));
	}

}
