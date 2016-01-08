package com.algorithms.backtracking;

public class SumOfSubsets {

	public static void sumOfSubsets(int[] weights, int depth, int sum,
			int remaining, int[] x, int m) {

		x[depth] = 1;
		if (sum + weights[depth] == m) {
			print(x, depth);
		} else if (depth <x.length-1 && sum + weights[depth] + weights[depth + 1] <= m) {
			sumOfSubsets(weights, depth + 1, sum + weights[depth], remaining
					- weights[depth], x, m);
		}
		if (sum + remaining - weights[depth] >= m
				&& sum + weights[depth + 1] <= m) {
			x[depth] = 0;
			sumOfSubsets(weights, depth + 1, sum, remaining - weights[depth],
					x, m);
		}
	}

	private static void print(int[] x, int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("****************************");

	}

	public static void main(String[] args) {

		int n = 6;
		int m = 30;
		int[] weights = new int[] {5, 10, 12, 13, 15, 18 };
		int [] x = new int[]{0,0,0,0,0,0};
		sumOfSubsets(weights, 0, 0, 73, x, m); 

	}

}
