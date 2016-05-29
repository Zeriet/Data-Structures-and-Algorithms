package com.zorolabs.misc;

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 1, 22, 8, 34, 12, 54, 10, 3, 6, 100, 23 };
		double startTime = System.nanoTime();
		int[] output = sort(input);
		double stopTime = System.nanoTime();
		double elapsedTime = stopTime - startTime;
		for (int x : output) {
			System.out.println(x);
		}
		System.out.println(elapsedTime);
	}
	static int[] sort(int[] arr) {
		int len = arr.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < len; ++i) {
			temp = arr[i];
			j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}
}
