package com.ds;

public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		priorityQueue.add(50);
		priorityQueue.add(90);
		priorityQueue.add(20);
		priorityQueue.add(30);
		priorityQueue.add(95);
		// priorityQueue.add(75);
		priorityQueue.add(75);
		priorityQueue.add(5);
		// priorityQueue.add(95);
		priorityQueue.add(1);
		priorityQueue.add(100);
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);
		priorityQueue.remove();
		System.out.println(priorityQueue);

	}

}
