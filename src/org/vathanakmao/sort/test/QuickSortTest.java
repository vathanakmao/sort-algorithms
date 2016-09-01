package org.vathanakmao.sort.test;

import org.vathanakmao.sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		// Example 1
		int[] arr = new int[]{ 3, 1 };
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		// Example 2
		arr = new int[]{ 1, 3 };
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		// Example 3
		arr = new int[]{ 1 };
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		arr = new int[]{ 1, 10, 7};
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		// Example 4
		arr = new int[]{ 10, 7, 70, 32};
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		// Example 5
		arr = new int[]{ 1, 10, 7, 4, 11, 70, 32, 21, 25};
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
		
		// Example 6
		arr = new int[]{ 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
		print(arr);
		QuickSort.sort(arr);
		print(arr);
		System.out.println("==================================================");
	}
	
	private static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
