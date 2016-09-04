package org.vathanakmao.sort;

public class HeapSort {

	public static void sort(int[] arr) {
		// the build max heap operation think 1 is the first index of the array
		int[] temp = new int[arr.length + 1];
		for (int i=1; i < temp.length; i++) {
			temp[i] = arr[i-1];
		}
		
//		HeapSortTest.println(temp);
		
		// build max heap (convert an array to a max heap)
		int heapSize = arr.length;
		buildMaxHeap(temp, heapSize);
		
//		HeapSortTest.println(temp);
		
		// loop from last node (arr[arr.length-1]) to root node (arr[1])
		heapSize = arr.length;
		for (int i = temp.length - 1; i >= 1; i--) {
			// exchange the root node with the last node
			int t = temp[1];
			temp[1] = temp[i];
			temp[i] = t;
//			System.out.println("After Swap:  i=" + i + ", temp[1]=" + temp[1] + ", temp[i]=" + temp[i]);
			
			heapSize--;
			
			// maxHeapify after exchanging root node (make sure all the keys of children are less than or equals to the keys of their parents)
			maxHeapify(temp, 1, heapSize);
			
//			HeapSortTest.println(temp);
//			System.out.println();
			
		} // end loop
		
		// assign the sorted array to the original one
		for (int i=1; i < temp.length; i++) {
			arr[i-1] = temp[i];
		}
	}
	
	/**
	 * Build a logical max heap (tree) using an array
	 * 
	 * @param arr
	 */
	private static void buildMaxHeap(int[] arr, int heapSize) {
		for (int i = arr.length/2; i >= 1; i--) {
			maxHeapify(arr, i, heapSize);
		}
	}
	
	/**
	 * Make sure the heap satisfy the max-heap property
	 * 
	 * @param arr
	 * @param i
	 */
	private static void maxHeapify(int[] arr, int i, int heapSize) {
		// Exchange parent node with one of its children if it's smaller than the child
		
		int l = left(i);
		int r = right(i);
		int largest = i;
		
		if (l <= heapSize && arr[largest] < arr[l]) {
			largest = l;
		}
		if (r <= heapSize && arr[largest] < arr[r]) {
			largest = r;
		}
		
		if (i != largest) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			maxHeapify(arr, largest, heapSize);
		}
	}
	
	private static int left(int i) {
		return i * 2;
	}
	
	private static int right(int i) {
		return i * 2 + 1;
	}
}
