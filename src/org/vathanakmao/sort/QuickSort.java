package org.vathanakmao.sort;

public class QuickSort {
	
	public static void sort(int[] arr) {
		int p = 0; 
		int r = arr.length - 1;
		
		// divide
		partition(arr, p, r);
		
		// conquer 
		
		// combine (do nothing)
	}
	
	private static void partition(int[] arr, int p, int r) {
		print(arr);
		
		if (p >= r) {
			return;
		}
		
		// move the smaller elements than pivot to the left
		int i = p;
		int q = p;
		while (i <= r) {
			if (arr[i] < arr[r]) { // arr[r] is pivot
				int temp = arr[q];
				arr[q] = arr[i];
				arr[i] = temp;
				q++;
			}
			i++;
		}
		
		int temp = arr[q];
		arr[q] = arr[r];
		arr[r] = temp;
		
//		System.out.println("p=" + p + ", q=" + q + ", r=" + r);
		partition(arr, p, q-1);
		partition(arr, q + 1, r);
	}
	
	private static void print(int[] arr1) {
//		for (int a : arr1) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n---------------");
	}
}
