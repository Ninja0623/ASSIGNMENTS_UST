package com.main;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListSizeTest {

	@Test
	public void test() {
		List<Integer> li=Arrays.asList(1,2,3);
		ListSize l=new ListSize();
		assertEquals(3,l.Size(li));
	}

}
