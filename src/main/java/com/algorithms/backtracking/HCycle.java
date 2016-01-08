package com.algorithms.backtracking;

public class HCycle {

	public static void hCycle(int depth, int[] x, int[][] graph, int n) {

		if (depth == n) {
			if (areAdjacent(graph, x[depth-1],x[0])) {
				print(x);
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			if ((depth == 0 ) || (areAdjacent(graph, x[depth-1],i) && !contains(x, i, depth - 1))) {
				x[depth] = i;
				hCycle(depth + 1, x, graph, n);
			}
		}
	}

	private static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print((x[i] + 1) + " ");
		}
		System.out.println();
		System.out.println("****************************");

	}

	private static boolean contains(int[] x, int element, int length) {
		for (int i = 0; i <= length; i++) {
			if (x[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean areAdjacent(int[][] graph, int i, int j){
		if(i==-1){
			return true;
		}
		return graph[i][j] == 1;
	}

	public static void main(String[] args) {
		 int graph[][] = new int[][] { { 1, 1, 1, 0, 0, 0, 1, 0 },
		 { 1, 1, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 0, 1, 0, 0 },
		 { 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1, 1, 0, 0 },
		 { 0, 0, 1, 0, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 1, 1 },
		 { 0, 1, 0, 0, 0, 0, 1, 1 } };
		 int x[] = new int[8];
		 int n=8;
//		int graph[][] = new int[][] { { 1, 1, 0, 1 }, { 1, 1, 1, 0 },
//				{ 0, 1, 1, 1 }, { 1, 0, 1, 1 } };
//		int x[] = new int[4];
//		int n=4;
		hCycle(0, x, graph, n);

	}

}
