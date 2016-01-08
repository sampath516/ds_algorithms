package com.daa.daq;
/*
 * https://www.youtube.com/playlist?list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int list[] = {7,2,8,1,10,3,35,4,11 };
		QuickSort qs = new QuickSort();
		qs.qSort(list, 0, 8);
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+",");
		}
	}
	
	
	public void qSort(int[] list, int start, int end){		
		if(start >= end){
			return;
		}
		int pIndex = partition(list, start, end);
		qSort(list, start, pIndex-1);
		qSort(list, pIndex, end);
	}
	

	public int partition(int[] list, int start, int end) {

		int pivot = list[end];
		int pIndex = start;
		for (int i = start; i <= end - 1; i++) {
			if (list[i] <= pivot) {
				swap(list, i, pIndex);
				pIndex++;
			}
		}
		swap(list, pIndex, end);
		return pIndex;
	}

	public void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
