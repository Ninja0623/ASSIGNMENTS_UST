package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CsvCheckTest {

	@Test
	public void test() {
		CsvCheck c=new CsvCheck();
		assertTrue(c.csvCheck("file.csv"));
	}

}
