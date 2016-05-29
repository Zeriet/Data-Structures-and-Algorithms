package com.zorolabs.sorting;

public class SortMain {
	
	public static void main(String[] args) {
		int[] input = { 25,90,35,45,150,43, 20, 10, 32, 62, 100, 23};
		
		
		double startTime = System.nanoTime();
		int[] output = BubbleSort.bubbleSortAlgo(input);
		double stopTime = System.nanoTime();
		double timeBubbleSort = stopTime - startTime;
		
		double startTime1 = System.nanoTime();
		int[] output1 = BubbleSort1.bubbleSortAlgo(input);
		double stopTime1 = System.nanoTime();
		double timeBubbleSort1 = stopTime1 - startTime1;
		
		double startTime2 = System.nanoTime();
		int[] output2 = BubbleSort2.bubbleSortAlgo(input);
		double stopTime2 = System.nanoTime();
		double timeBubbleSort2 = stopTime2 - startTime2;

		for (int x : output) {
			System.out.println(x);
		}
		System.out.println("\n");

		for (int x : output1) {
			System.out.println(x);
		}
		
		System.out.println("\n");

		for (int x : output2) {
			System.out.println(x);
		}
		
		System.out.println("Running time for BubbleSort is: "+timeBubbleSort);
		System.out.println("Running time for BubbleSort1 is: "+timeBubbleSort1);
		System.out.println("Running time for BubbleSort2 is: "+timeBubbleSort2);


	}

}
