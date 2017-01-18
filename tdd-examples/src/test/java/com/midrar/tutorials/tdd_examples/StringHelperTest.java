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

	@Test
	public void testStringWith2Chars() {
		StringHelper stringHelper = new StringHelper();
		String expected = "BA";
		String actual = stringHelper.swapLast2Chars("AB");
		assertEquals(expected, actual);
	}

}
