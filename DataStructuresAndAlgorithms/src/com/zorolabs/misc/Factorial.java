package com.zorolabs.misc;

public class Factorial {
	
	public static void main(String[] args){
		System.out.println("The factorial is:" +factorial(4));
	}
	public static int factorial(int num){
		if(num ==0 || num ==1){
			return 1;		
		}
		return factorial(num-1)*num;
		
	}

}
