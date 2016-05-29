package com.zororlabs.stringMisc;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args){
		
		System.out.println("Are the words anagram: "+iAnagram("zee", "ez"));
		
	}
	
	public static boolean iAnagram(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();       
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
       
        return Arrays.equals(charFromWord, charFromAnagram);
    }


}
