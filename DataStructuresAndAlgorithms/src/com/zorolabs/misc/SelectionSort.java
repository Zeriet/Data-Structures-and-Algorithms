package com.zorolabs.misc;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 10, 2, 8, 3, 6, 100, 23 };
		double startTime = System.nanoTime();
		int[] output = selectionSortAlgo(input, input.length);
		double stopTime = System.nanoTime();
		double elapsedTime = stopTime-startTime;
		for (int x : output) {
			System.out.println(x);
		}
		System.out.println(elapsedTime);
	}

	public static int[] selectionSortAlgo(int[] arrUnsorted, int n) {
		int iMin, j;
		for (int i = 0; i < n - 1; i++) {

			iMin = i; //
			for (j = i + 1; j < n; j++) {
				if (arrUnsorted[j] < arrUnsorted[iMin]) {
					iMin = j; // update the index of min element

				}
			}
			int temp = arrUnsorted[i];
			arrUnsorted[i] = arrUnsorted[iMin];
			arrUnsorted[iMin] = temp;

		}

		return arrUnsorted;

	}
}
