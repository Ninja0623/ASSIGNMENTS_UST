package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class UpperCaseConversionTest {

	@Test
	public void testUpper() {
		UpperCaseConversion s=new UpperCaseConversion();
		String res=s.Upper("java");
		assertEquals("JAVA",res);
	}

}
