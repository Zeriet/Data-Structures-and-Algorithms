package com.zorolabs.misc;

class MergingTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 8, 17 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };
		int[] myResult = mergeArray(arr1, arr2);
		for (int x : myResult) {
			System.out.println(x);
		}

	}
// problem 3
	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int resultLen = n + m + 1;
		int i = 0, j = 0;
		int k = 0;

		int[] result = new int[resultLen - 1];// check this one
		while (i < n || j < m) {
			if (i < n && arr1[i] <= arr2[j]) {
				result[k] = arr1[i];
				i++;
				k++;
			} else {

				result[k] = arr2[j];
				j++;
				k++;
			}

		}
		return result;
	}
}
