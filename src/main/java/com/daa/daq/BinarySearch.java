package com.daa.daq;

public class BinarySearch {

	public int binarySearch(int[] list, int start, int end, int key) {

		if (start == end) {
			if (key == list[start]) {
				return start;
			}
			return -1;
		}
		int mid = (start + end) / 2;
		if (key == list[mid]) {
			return mid;
		}
		int position = -1;
		if (key < list[mid]) {
			position = binarySearch(list, start, mid - 1, key);
		} else {
			position = binarySearch(list, mid + 1, end, key);
		}
		return position;
	}

	public static void main(String args[]) {
		int[] list = new int[] { 5, 10, 20, 50, 50, 60, 70 };
		BinarySearch binSearch = new BinarySearch();
		int position = binSearch.binarySearch(list, 0, list.length - 1, 50);
		System.out.println(position);
	}

}
