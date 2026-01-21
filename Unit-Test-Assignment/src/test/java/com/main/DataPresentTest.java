package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataPresentTest {

	@Test
	public void test() {
		DataPresent d=new DataPresent();
		String s="Java is easy to learn";
		String data="Java";
		assertTrue(d.preseent(s, data));
	}

}
