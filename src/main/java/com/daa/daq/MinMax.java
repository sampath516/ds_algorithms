package com.daa.daq;

public class MinMax {

	public Result minMax(int[] list, int start, int end) {
		Result result = new Result();
		if (start == end) {
			result.min = result.max = list[start];
			return result;
		} else if (start == end - 1) {
			if (list[start] < list[end]) {
				result.min = list[start];
				result.max = list[end];
			} else {
				result.min = list[end];
				result.max = list[start];
			}

			return result;
		} else {
			int mid = (start + end) / 2;
			Result result1 = minMax(list, start, mid);
			Result result2 = minMax(list, mid + 1, end);

			if (result1.min < result2.min) {
				result.min = result1.min;
			} else {
				result.min = result2.min;
			}
			if (result1.max > result2.max) {
				result.max = result1.max;
			} else {
				result.max = result2.max;
			}

			return result;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MinMax minMax = new MinMax();
		int[] list = new int[] { 10 };
		Result res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

		list = new int[] { -1, -2 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

		list = new int[] { -2, 10, 20, -1 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + "& " + res.max);

		list = new int[] { -1, 10, 20, 90 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

		list = new int[] { -1, 10, 20, 90, 30 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

		list = new int[] { 5, 10, 20, 50, 55, 60, 77 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

		list = new int[] { 5, 10, 20, 50, 55, 60, 90, -5 };
		res = minMax.minMax(list, 0, list.length - 1);
		System.out.println(res.min + " " + res.max);

	}

	class Result {
		public int max = 0;
		public int min = 0;
	}

}
