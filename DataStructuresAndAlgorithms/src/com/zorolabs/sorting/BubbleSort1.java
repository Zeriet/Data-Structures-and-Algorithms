package com.zorolabs.sorting;

public class BubbleSort1 {

	static int[] bubbleSortAlgo(int[] arrA) {

		int len = arrA.length;
		// In the best case (which means here that the in- put is already
		// sorted), this algorithm runs in O(n) time.

		for (int k = 0; k < len - 1; k++) {
			int flag = 0;
			for (int i = 0; i < len - 1; i++) {
				if (arrA[i] > arrA[i + 1]) {
					 swap(arrA, i,i+1);
					flag = 1;
				}

			}
			if (flag == 0)
				break;

		}

		return arrA;
	}

	static void swap(int[] arrA, int i, int j) {
		int temp = arrA[i];
		arrA[i] = arrA[j];
		arrA[j] = temp;
	}

}
