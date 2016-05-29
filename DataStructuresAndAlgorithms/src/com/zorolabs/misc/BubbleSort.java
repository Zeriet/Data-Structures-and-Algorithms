package com.zorolabs.misc;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 1, 2, 10, 3, 6, 100, 23 };
		double startTime = System.nanoTime();
		int[] output = bubbleSortAlgo(input, input.length + 1);
		double stopTime = System.nanoTime();
		double elapsedTime = stopTime - startTime;
		for (int x : output) {
			System.out.println(x);
		}
		System.out.println(elapsedTime);
	}

	static int[] bubbleSortAlgo(int[] arrA, int len) {

		int temp = 0;
		// In the best case (which means here that the in- put is already
		// sorted), this algorithm runs in O(n) time.

		for (int k = 1; k < len - 1; k++) {
			int flag = 0;
			for (int i = 0; i < len - k - 1; i++) {
				if (arrA[i] > arrA[i + 1]) {
					temp = arrA[i];
					arrA[i] = arrA[i + 1];
					arrA[i + 1] = temp;
					flag = 1;
				}

			}
			if (flag == 0)
				break;

		}

		return arrA;
	}


}
