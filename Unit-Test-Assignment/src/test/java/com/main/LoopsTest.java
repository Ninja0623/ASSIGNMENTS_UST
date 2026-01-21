package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoopsTest {

	@Test
	public void test() {
		Loops l=new Loops();
		int a[]={1,2,3};
		assertTrue(l.cheak(a,3));
	}

}
