package org.vathanakmao.sort.test;

import org.vathanakmao.sort.MergeSort;

public class MergeSortTest {

	public static void main(String[] args) {
		// Example 1
		int[] arr = new int[]{ 3, 1 };
		print(arr);
		int[] result = MergeSort.sort(arr);
		print(result);
		System.out.println("==================================================");
		
		// Example 2
		arr = new int[]{ 1, 3 };
		print(arr);
		result = MergeSort.sort(arr);
		print(result);
		System.out.println("==================================================");
		
		// Example 3
		arr = new int[]{ 1 };
		print(arr);
		result = MergeSort.sort(arr);
		print(result);
		System.out.println("==================================================");
		
		arr = new int[]{ 1, 10, 7};
		print(arr);
		result = MergeSort.sort(arr);
		print(result);
		System.out.println("==================================================");
		
		// Example 4
		arr = new int[]{ 1, 10, 7, 4, 11, 70, 32, 21, 25};
		print(arr);
		result = MergeSort.sort(arr);
		print(result);
		System.out.println("==================================================");
	}
	
	private static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
