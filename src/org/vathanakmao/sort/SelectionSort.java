package org.vathanakmao.sort;

public class SelectionSort {

	public static void sort(int[] arr) {
		int q = 0;
		while (q < arr.length - 1) {
			int minIndex = q;
			for (int i = q + 1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[q];
			arr[q] = temp;
			q++;
		}
	}
}
