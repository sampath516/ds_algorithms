package com.daa.daq;
public class DivideAndConquer {

	/**
	 * @param args
	 */
	public static int count = 0;
	public static void main(String[] args) {

//		 int[] array = { 2, 8, 23, 56, 1, 9, 50 };
//		 int max = findMaxElement(array, 0, 6);
//		 System.out.println(max);
		
		long result = findPower(2, 31);
		System.out.println(result);
		 System.out.println("Count"+count); 

	}

	public static int findMaxElement(int[] array, int start, int end) {
		count++;
		if (start == end) {
			return array[start];
		}
		if (start == end - 1) {
			if (array[start] >= array[end]) {
				return array[start];
			} else {
				return array[end];
			}
		}
		int mid = (start + end) / 2;
		int max1 = findMaxElement(array, start, mid);
		int max2 = findMaxElement(array, mid + 1, end);
		if (max1 >= max2) {
			return max1;
		} else {
			return max2;
		}
	}

	public static long findPower(int x, int n) {
		count++;
		if (n <= 1) {
			if (n == 0) {
				return 1;
			}
			return x;
		}
		long num = 0;
		if (n % 2 != 0) {
			num = findPower(x, n - 1) * x;
		} else {
			num = findPower(x, n / 2);
			num = num * num;
		}
		return num;

	}

}
