package com.algorithms.backtracking;

public class Permutations {

	public static void generatePermutations(char[] in, int noOfChars) {
		char[] out = new char[3];
		for (int i = 0; i < noOfChars; i++) {
			out[0] = in[i];
			for (int j = 0; j < noOfChars; j++) {
				if (contains(out, 1, in[j])) {
					continue;
				}
				out[1] = in[j];
				for (int k = 0; k < noOfChars; k++) {
					if (contains(out, 2, in[k])) {
						continue;
					}
					out[2] = in[k];
					System.out.println(out[0] + "-" + out[1] + "-" + out[2]);
				}
			}
		}
	}

	private static boolean contains(char[] in, int offset, char c) {
		for (int i = 0; i < offset; i++) {
			if (in[i] == c) {
				return true;
			}
		}
		return false;
	}

	public static void generatePermutationsRecursive(int depth, char[] in,
			char[] out, int length) {

		if (depth == length) {
			return;
		}
		for (int i = 0; i < in.length; i++) {

			if (contains(out, depth, in[i])) {
				continue;
			}
			out[depth] = in[i];
			if (depth == length - 1) {
				System.out.println(out[0] + "-" + out[1] + "-" + out[2]);
			}
			generatePermutationsRecursive(depth+1, in, out, length);

		}
	}

	public static void main(String[] args) {
		char[] in = { 'a', 'b', 'c' };
		char[] out = new char[3];
		// generatePermutations(in, 3);
		generatePermutationsRecursive(0, in, out, 3);
	}

}
