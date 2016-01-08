package com.ds.heap.array;
public class MaxHeap {

	public void insert(int[] a, int n) {

		int j = n;
		int parent = (j - 1) / 2;
		int x = a[n];
		while (parent >= 0 && a[parent] < x) {
			swap(a, parent, j);
			if (parent == 0) {
				break;
			}
			j = parent;
			parent = (parent - 1) / 2;
		}
	}

	public int deleteMax(int[] a, int n) {
		int max = a[0];
		a[0] = a[n];
		adjust(a, 0, n - 1);
		return max;
	}

	private void adjust(int[] a, int i, int n) {
		int j = 2 * i + 1;

		while (j <= n) {
			if ((j < n) && a[j] < a[j + 1]) {
				j++;
			}
			int parent = (j - 1) / 2;
			if (a[j] > a[parent]) {
				swap(a, parent, j);
			}
			j = 2 * j + 1;
		}

	}

	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testHeapsort_v1();

	}

	public void heapSort_v1(int[] a) {
		heapify(a, a.length - 1);
		for (int i = a.length - 1; i > 0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			adjust(a, 0, i - 1);
		}
	}

	public void heapify(int[] a, int n) {
		int i = (n - 1) / 2;
		while (i >= 0) {
			adjust(a, i, n);
			if (i == 0) {
				break;
			}
			i--;
		}
	}
	

	public static void testHeapsort_v1() {
		int[] a = { 10, 20, 50, 90, 80, 85, 6, 5, 2 };
		MaxHeap heap = new MaxHeap();
		heap.heapSort_v1(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}


	public static void testHeapify() {
		int[] a = { 10, 20, 50, 90, 80, 85, 6, 5, 2 };
		MaxHeap heap = new MaxHeap();
		heap.heapify(a, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void testDeleteMax() {
		int[] a = { 80, 70, 60, 45, 25, 20, 30, 35, 21 };
		MaxHeap heap = new MaxHeap();
		heap.deleteMax(a, a.length - 1);
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void testInsert() {
		int[] a = { 80, 70, 60, 45, 25, 20, 30, 35, 75 };
		MaxHeap heap = new MaxHeap();
		heap.insert(a, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void testAdjust() {
		int[] a = { 35, 70, 60, 45, 25, 20, 30 };
		MaxHeap heap = new MaxHeap();
		heap.adjust(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}
