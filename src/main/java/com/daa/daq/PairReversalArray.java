package com.daa.daq;

public class PairReversalArray {

	public void pairReverse(int[] list, int start, int end) {
		int diff = end - start;
		if (diff <= 1) {
			if (diff == 1) {
				int temp = list[start];
				list[start] = list[end];
				list[end] = temp;
			}
			return;
		}
		int mid = (start + end) / 2;
		pairReverse(list, start, mid);
		if (mid < end) {
			pairReverse(list, mid + 1, end);
		}

	}

	public static void main(String args[]) {
		int[] list = new int[] { 5, 10, 20, 50, 55, 60 };
		PairReversalArray pairReversalArray = new PairReversalArray();
		pairReversalArray.pairReverse(list, 0, list.length-1);
		for (int i = 0; i < list.length; i++) {
			System.out.print(" "+ list[i]);
		}

	}

}
