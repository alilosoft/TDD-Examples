package com.midrar.tutorials.tdd_examples;

public class StringHelper {

	public String swapLast2Chars(String str) {
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		return ""+secondChar + firstChar;
	}

}
