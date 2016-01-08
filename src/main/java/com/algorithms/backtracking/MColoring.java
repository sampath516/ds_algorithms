package com.algorithms.backtracking;

public class MColoring {

	public static void mcoloring(int[][] graph, int m, int[] x, int n, int depth) {

		if (depth == n) {
			print(x, n);
			return;
		}

		for (int i = 0; i < m; i++) {
			x[depth] = i;
			if (isItRightColor(graph, x, depth)) {
				mcoloring(graph, m, x, n, depth+1);
			}
		}
	}

	private static boolean isItRightColor(int[][] graph, int[] x, int depth) {

		for (int j = 0; j < depth; j++) {
			if (graph[j][depth] != 0 && x[j] == x[depth]) {
				return false;
			}
		}
		return true;
	}

	private static void print(int[] x, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print((x[i]+1) + " ");
		}
		System.out.println();
		System.out.println("****************************");


	}

	public static void main(String[] args) {
		
		int m = 3;
		int n = 4;
		int [] x = new int[]{-1,-2,-3,-4};
		
		int [][] graph = new int [][]{{1,1,0,1},{1,1,1,0},{0,1,1,1},{1,0,1,1}};
		mcoloring(graph, m, x, n, 0); 

	}

}
