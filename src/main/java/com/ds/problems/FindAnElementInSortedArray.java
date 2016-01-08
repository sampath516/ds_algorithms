package com.ds.problems;

/**
 * 
 * @author sgunda
 * 
 *         Given a two dimensional array of integers in which both rows and
 *         columns are in sorted order, find an efficient algorithm to find
 *         whether an element x exists in the array.
 * 
 *         Example Array:
 * 
 *       <nl>  5 15 20 </nl> 
 *         30 40 50 
 *         35 45 60
 * 
 * 
 */
public class FindAnElementInSortedArray {

	public static boolean findAnElementInSortedArray(int[][] array, int n,
			int m, int x) {
		boolean result = false;

		for (int i = 0; i < n; i++) {
			for (int j = m - 1; j >= 0; j--) {
				if (x == array[i][j]) {
					result = true;
				} else if (x > array[i][j]) {
					break;
				}
			}
		}

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] array = new int[][] { { 5, 15, 20, 25 }, { 40, 45, 50, 55 },
				{ 51, 56, 60, 65 }, { 70, 75, 80, 85 } };
		System.out.println(findAnElementInSortedArray(array, 4, 4, 80));
		System.out.println(findAnElementInSortedArray(array, 4, 4, 51));
		System.out.println(findAnElementInSortedArray(array, 4, 4, 100));

	}

}
