package com.ds.queue;

public class Queue {
	private static final int SIZE = 100;
	int[] elements = new int[SIZE];
	int front = 0;
	int rear = 0;

	public int getSize() {
		return (SIZE + rear - front) % SIZE;
	}

	public boolean isEmpty() {
		return (rear == front);
	}

	public int dequeue() {
		int element = 0;
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		element = elements[front];
		front = (front + 1) % SIZE;
		return element;
	}

	public void enqueue(int n) {
		if (getSize() == SIZE) {
			throw new RuntimeException("Queue is Full");
		}
		elements[rear] = n;
		rear = (rear + 1) % SIZE;
	}
}
