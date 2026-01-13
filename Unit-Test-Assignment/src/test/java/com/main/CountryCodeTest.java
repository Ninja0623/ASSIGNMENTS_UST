package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountryCodeTest {

	@Test
	public void test() {
		CountryCode c=new CountryCode();
		assertEquals("IN",c.defaultCode());
	}

}
