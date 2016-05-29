package com.zorolabs.misc;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = { 1, 22, 8, 34, 12, 54, 10, 3, 6, 100, 23 };
		double startTime = System.nanoTime();
		int[] output = mergeSortAlgo(input);
		double stopTime = System.nanoTime();
		double elapsedTime = stopTime - startTime;
		for (int x : output) {
			System.out.println(x);
		}
		System.out.println(elapsedTime);
	}

	static int[] mergeSortAlgo(int[] arraA) {
		int n = arraA.length;
		if (n < 2) {
			return arraA;
		}
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arraA[i];
		}
		for (int j = mid; j < n - 1; j++) {
			right[j - mid] = arraA[j];
		}

		mergeSortAlgo(left);
		mergeSortAlgo(right);
		merge(left, right, arraA);
		return arraA;

	}

	static int[] merge(int[] left, int[] right, int[] inputArr) {

		int nL = left.length;
		int nR = right.length;
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < nL && j < nR) {

			if (left[i] <= right[j]) {
				inputArr[k] = left[i];

				i++;
			} else {
				inputArr[k] = right[j];

				j++;
			}
			k++;
			while (i < nL) {
				inputArr[i] = left[i];
				i++;
			}
			while (j < nR) {
				inputArr[j] = right[j];
				j++;
			}

		}

		return inputArr;
	}

}
