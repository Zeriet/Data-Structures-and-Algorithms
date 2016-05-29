package com.zorolabs.misc;

import java.util.ArrayList;
import java.util.List;

public class RecursiveMax {
	

	public static void main(String[] args){
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(100);
		myList.add(34);
		myList.add(345);
		myList.add(256);
		
		System.out.println("Max num is: "+recursiveMax(myList, 4));
	}
	public static Integer recursiveMax(List<Integer> myList, int n){
		
		if(n==1){
			return myList.get(0);
		}
		
		return Math.max(recursiveMax(myList,n-1), myList.get(n-1));
		
	}

}
