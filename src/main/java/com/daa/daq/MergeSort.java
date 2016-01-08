package com.daa.daq;

public class MergeSort {

	public void mergeSort(int[] list, int start, int end) {

		if (start < end) {

			int mid = (start + end) / 2;
			mergeSort(list, start, mid);
			mergeSort(list, mid + 1, end);
			merge(list, start, mid, end);
		}

	}

	public void merge(int[] list, int start, int mid, int end) {
		int[] temp = new int[50];
		int k = 0;
		int i = start, j = mid + 1;
		for (; (i <= mid && j <= end);) {
			if (list[i] < list[j]) {
				temp[k++] = list[i++];
			} else {
				temp[k++] = list[j++];
			}
		}
		if (i <= mid) {
			for (; i <= mid;) {
				temp[k++] = list[i++];
			}
		}

		if (j <= end) {
			for (; j <= end;) {
				temp[k++] = list[j++];
			}
		}
		for (int m = start, n = 0; m <= end; m++) {
			list[m] = temp[n++];
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = new int[] { 10, 5, 2, 1, -20, 60, 20, 200, 1, 2, -2 };
		MergeSort ms = new MergeSort();
		ms.mergeSort(list, 0, list.length - 1);
		for (int m = 0; m <= list.length - 1; m++) {
			System.out.print(list[m] + " ");
		}
	}

}
