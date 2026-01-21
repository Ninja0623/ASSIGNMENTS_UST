package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeExceptionTest {

	@Test(expected=IllegalArgumentException.class)
	public void test() {
		AgeException a=new AgeException();
		a.check(-1);
	}

}
