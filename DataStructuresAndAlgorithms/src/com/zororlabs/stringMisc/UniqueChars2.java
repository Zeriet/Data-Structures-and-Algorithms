package com.zororlabs.stringMisc;

public class UniqueChars2 {
	
	public static void main(String[] args){
		String str = "zeriet";
		System.out.println("Is the word " +str +" unique"+isUniqueChars(str));
	}
	public static boolean isUniqueChars(String str){
		
		boolean[] char_set = new boolean[256];
		
		for(int i=0; i<str.length();i++){
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
			
		}
		return true;
		
	}

}
