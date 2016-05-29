package com.zorolabs.stringMisc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws IOException{
		int[] a =  new int[]{1,3,46,1,3,9};
		System.out.println(numberOfPairs(a,47));
		
    }


	/*
	 * Complete the function below.
	 */

	    static int numberOfPairs(int[] a, long k) {
			HashSet<Integer> set = new HashSet<Integer>();
			ArrayList<Integer> list = new ArrayList<Integer>();
	        Set newSet = null;
			int diffrence = 0;
			for (Integer i : a) {
				set.add(i);
			}
			for (int i = 0; i < a.length; i++) {
				diffrence = (int) (k - a[i]);
				if (set.contains(diffrence) && a[i] != diffrence) {
					list.add(a[i]);
					list.add(diffrence);
	                newSet = new HashSet<>(list);
	                		
				}
			}
			return newSet.size();

		}


}
