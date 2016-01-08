package com.daa.general;


public class PairReversalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = new int[] { 5, 10, 20, 50, 55, 60, 77 };
		PairReversalArray pairReversalArray = new PairReversalArray();
		pairReversalArray.reversePair(list);

	}
	
	
	public void reversePair(int[] list){
		
		for(int i = 0; (i+1)<list.length;i=i+2 ){
			int temp = list[i];
			list[i] = list[i+1];
			list[i+1] = temp;
			
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(" "+ list[i]);
		}
	}

}
