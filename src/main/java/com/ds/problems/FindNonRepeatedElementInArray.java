package com.ds.problems;

import java.util.HashSet;
import java.util.Set;

import com.ds.HashMap;
import com.ds.Map;

public class FindNonRepeatedElementInArray {

	public static int findNonRepeatedElementInArray(int[] array) {
		Set<Integer> map = new HashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (map.contains(array[i])) {
				map.remove(array[i]);
			} else {
				map.add(array[i]);
			}
		}
		assert(map.size()>0);
		return map.iterator().next(); 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[] { 5, 10, 90, 10, 5, 90, 55, 65, 65 };
		System.out.println(findNonRepeatedElementInArray(array1));
	}

}
