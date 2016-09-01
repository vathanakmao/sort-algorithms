package org.vathanakmao.sort;

public class BubbleSort {

	public static void sort(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			i = 0;
			for (int r = 0; r < j; r++) {
				if (arr[r] > arr[r+1]) {
					int temp = arr[r];
					arr[r] = arr[r+1];
					arr[r+1] = temp;
				}
			}
			j--;
		}
	}
}
