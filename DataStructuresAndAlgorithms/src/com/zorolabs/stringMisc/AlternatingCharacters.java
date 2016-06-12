/**
 * 
 */
package com.zorolabs.stringMisc;

import java.util.Scanner;

/**
 * @author zwoldeab
 * 
 */
public class AlternatingCharacters {

	public static void main(String[] args) {
		/*
		 * Shashank likes strings in which consecutive characters are different.
		 * For example, he likes ABABA, while he doesn't like ABAA. Given a
		 * string containing characters and only, he wants to change it into a
		 * string he likes. To do this, he is allowed to delete the characters
		 * in the string. Your task is to find the minimum number of required
		 * deletions. Input Format The first line contains an integer , i.e. the
		 * number of test cases. The next lines contain a string each. Output
		 * Format For each test case, print the minimum number of deletions
		 * required. Explanation
		 * 
		 * AAAA A, 3 deletions 
		 * BBBBB B, 4 deletions
		 * ABABABAB ABABABAB, 0 deletions 
		 * BABABA BABABA, 0 deletions
		 * AAABBB AB, 4 deletions because
		 * to convert it to AB we need to delete 2 A's and 2 B's
		 */

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String[] s = new String[T];
		for (int i = 0; i < T; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			char[] c = s[i].toCharArray();
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] == c[j + 1])
					count++;
			}
			System.out.println(count);
		}

	}

}
