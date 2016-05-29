package com.zorolabs.stringMisc;

public class ReverseString {

	public static void main(String[] args) {

		String s = "beles";

		System.out.println("Reverse of " + s + " is " + reverseRecursively(s));
		System.out.println("Reverse of " + s + " is " + reverse(s));


	}

	public static String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}

		return strBuilder.toString();
	}

	static String reverseRecursively(String st) {
		if (st.length() < 1) {
			return st;
		}

		return reverseRecursively(st.substring(1)) + st.charAt(0);

	}
}
