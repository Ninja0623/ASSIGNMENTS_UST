package com.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoteEligiblityCheckTest {

	@Test
	public void testAgeCheck() {
		VoteEligiblityCheck check=new VoteEligiblityCheck();
		assertTrue(check.ageCheck(18));
	}
	
	@Test
	public void testFalseAgeCheck() {
		VoteEligiblityCheck check=new VoteEligiblityCheck();
		assertTrue(check.ageCheck(17)); //age less than 18
	}

}
