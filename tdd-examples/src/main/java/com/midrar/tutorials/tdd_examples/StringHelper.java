package com.midrar.tutorials.tdd_examples;

public class StringHelper {

	public String swapLast2Chars(String str) {
		if(str == null) return null;
		
		int lenght = str.length();
		if (lenght <= 1) return str;
		
		String strExceptLast2Chars = str.substring(0, lenght - 2);
		char secondLastChar = str.charAt(lenght - 2);
		char lastChar = str.charAt(lenght - 1);
		return strExceptLast2Chars + lastChar + secondLastChar;
	}

}
