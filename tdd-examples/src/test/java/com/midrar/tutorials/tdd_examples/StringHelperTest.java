package com.midrar.tutorials.tdd_examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author alilo
 * 	User Story:
 * 	Given: a string 'str' of n chars;
 * 	When: 'str' length is greater then or equal to 2 chars;
 * 	Then: swap the last tow chars;
 * 
 *  Conditions:
 *  'AB' => 'BA', 'ABC' => 'ACB', 'A' => 'A', '' => '', null => throws exception
 */

public class StringHelperTest {
	
	StringHelper stringHelper = new StringHelper();
	
	// test condition 1: string with 2 chars length 
	@Test
	public void testStringWith2Chars() {
		String expected = "BA";
		String actual = stringHelper.swapLast2Chars("AB");
		assertEquals(expected, actual);
	}
	
	// test condition 2: string with n chars length 
	@Test
	public void testStringWith3Chars() {
		String expected = "ACB";
		String actual = stringHelper.swapLast2Chars("ABC");
		assertEquals(expected, actual);
	}

}
