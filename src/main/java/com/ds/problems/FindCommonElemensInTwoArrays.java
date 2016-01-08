package com.ds.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author sgunda 
 *         Given two arrays of integers, provide an efficient algorithm
 *         to find out the number of common elements in both the arrays. For
 *         example, Given two arrays:
 * 
 *         A: {5, 10, 8, 9, 20, 6} 
 *         B: {5, 4, 10, 7, 6, 20}
 *         
 *         Answer : 4       (5, 10, 6 and 20 are available in both the arrays)
 */
public class FindCommonElemensInTwoArrays {

	public static Set<Integer> findCommonElementsInTwoArrays(int[] array1,
			int[] array2) {
		Set<Integer> commonElements = new HashSet<Integer>();

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for (int j = 0; j < array1.length; j++) {
			if (!set.add(array2[j])) {
				commonElements.add(array2[j]);
			}
		}

		return commonElements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[] { 5, 10, 90, 80, 30, 20, 55, 65 };
		int[] array2 = new int[] { 5, 15, 95, 80, 35, 20, 55, 60, 60, 55 };
		Set<Integer> commonElements = findCommonElementsInTwoArrays(array1,
				array2);

		for (Integer element : commonElements) {
			System.out.print(element + ",");
		}

	}

}
