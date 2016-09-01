package org.vathanakmao.sort;

public class MergeSort {
	
	public static int[] sort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return arr;
		}
		
		// divide
		int mid = arr.length / 2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		divide(arr, left, right, mid);
		
		// conquer (sort recursively)
		int[] resultLeft = sort(left);
		int[] resultRight = sort(right);
		
		// combine (merge with sort)
		int result[] = mergeWithSort(resultLeft, resultRight);
		return result;
	}
	
	private static void divide(int[] arr, int[] left, int[] right, int mid) {		
		int l=0, r=0;
		for (int i=0; i<arr.length; i++) {
			if (i < mid) {
				left[l++] = arr[i];
			}
			else {
				right[r++] = arr[i];
			}
		}
		
		print(left, right);
	}
	
	private static int[] mergeWithSort(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		
		int i=0, l=0, r=0;
		while (i < result.length) {
			if (l == left.length) {
				result[i++] = right[r++];
				continue;
			} 
			if (r == right.length) {
				result[i++] = left[l++];
				continue;
			}
			
			if (left[l] < right[r]) {
				result[i++] = left[l++];
			} else {
				result[i++] = right[r++];
			}
		}
		
//		System.out.println();
		return result;
	}
	
	private static void print(int[] arr1, int[] arr2) {
//		for (int a : arr1) {
//			System.out.print(a + " ");
//		}
//		System.out.print("  |  ");
//		for (int a : arr2) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n---------------");
	}

}
