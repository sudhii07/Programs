package DSPrograms;

import Abtract.MainClass;

public class MergeSort {
	static void partition(int[] a, int left, int middle, int right) {
		int[] lta = new int[middle - left + 2];
		int[] rta = new int[right - middle + 1];
		for (int i = 0; i <= middle - left; i++) {
			lta[i] = a[left + i];
		}
		for (int i = 0; i < right - middle; i++) {
			rta[i] = a[middle + 1 + i];
		}
		lta[middle - left + 1] = Integer.MAX_VALUE;
		rta[right - middle] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {
			if (lta[i] < rta[j]) {
				a[k] = lta[i];
				i++;
			} else {
				a[k] = rta[j];
				j++;
			}
		}
	}

	static void msort(int[] arr, int left, int right) {
		if (right > left) {
			int m = (left + right) / 2;
			msort(arr, left, m);
			msort(arr, m + 1, right);
			partition(arr, left, m, right);
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 1, 3};
		int n = arr.length;
		msort(arr, 0, n - 1);
		printArray(arr);
	}

}
