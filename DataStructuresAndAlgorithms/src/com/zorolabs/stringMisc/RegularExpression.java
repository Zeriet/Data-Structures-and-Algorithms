package com.zorolabs.stringMisc;

import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args){
		System.out.println("does the string contains only  digits: "+patternMatcer("234j"));
	}
	
	static boolean patternMatcer(String st){
		String regex = ".*\\D.*";
		Pattern pattern = Pattern.compile(regex);
		return !pattern.matcher(st).matches();
		
	}

}
