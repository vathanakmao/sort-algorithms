package org.vathanakmao.sort.test;

import org.vathanakmao.sort.HeapSort;

public class HeapSortTest {

	public static void main(String[] args) {
		// Example from the book
		int[] arr = new int[] {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");
		
		// Example 1
		arr = new int[]{ 3, 1 };
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");

		// Example 2
		arr = new int[]{ 1, 3 };
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");

		// Example 3
		arr = new int[]{ 1 };
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");

		arr = new int[]{ 1, 10, 7};
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");

		// Example 4
		arr = new int[]{ 1, 10, 7, 4, 11, 70, 32, 21, 25};
		println(arr, "Original:  ");
		HeapSort.sort(arr);
		println(arr, "Sorted:    ");
		System.out.println("==================================================");
	}
	
	public static void println(int[] arr, String msg) {
		System.out.print(msg);
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
