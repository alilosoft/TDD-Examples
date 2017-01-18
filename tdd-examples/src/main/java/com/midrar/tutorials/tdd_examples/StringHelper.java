package com.midrar.tutorials.tdd_examples;

public class StringHelper {

	public String swapLast2Chars(String str) {
		int strLenght = str.length();
		String strExceptLast2Chars = str.substring(0, strLenght - 2);
		char secondLastChar = str.charAt(strLenght - 2);
		char lastChar = str.charAt(strLenght - 1);
		return strExceptLast2Chars + lastChar + secondLastChar;
	}

}
