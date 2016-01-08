package com.algorithms.backtracking;

public class NQueens {

	public static void nQueens(int x[], int depth, int length) {

		for (int i = 0; i < length; i++) {
			if (place(x, depth, i)) {
				x[depth] = i;
				if (depth == length - 1) {
					print(x);
					return;
				}
				nQueens(x, depth + 1, length);
			}
		}
	}

	private static void print(int[] x) {
		for(int i = 0; i<x.length; i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	private static boolean place(int x[], int depth, int i) {

		for (int k = 0; k < depth; k++) {
			// (k, x[k]) --- (depth, i)
			if (x[k] == i || Math.abs(depth - k) == Math.abs(x[k] - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 8;
		int[] x = new int[n];
		nQueens(x, 0, n ); 

	}

}
