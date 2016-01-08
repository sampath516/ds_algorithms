package com.ds.heap;

public class MaxHeap_v1 {
	int[] items = new int[100];
	int heapSize = 0;

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

	public void insert(int x) {
		items[heapSize] = x;
		int i = heapSize;
		while (i > 0 && items[(i - 1) / 2] < x) {
			items[i] = items[(i - 1) / 2];
			i = (i - 1) / 2;
		}
		items[i] = x;
		heapSize++;
	}

	public int deleteMax() {
		if(heapSize == 0){
			System.out.println("Heap is empty"); 
		}
		int max = items[0];
		items[0] = items[heapSize - 1];
		adjust(0);
		return max;
	}

	private void adjust(int i) {

		int j = 2*i+1;
		int x = items[i];
		while(i<heapSize){
			if(j<heapSize-1 && items[j] < items[j+1]){
				j++;
			}
			if(x>=items[j]){
				break;
			}
			items[(j-1)/2] = items[j];
			j = 2*j+1;
		}
		items[(j-1)/2] = x;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
