package com.ds.stack;

import com.ds.queue.Queue;

public class StackWithSingleQueue {

	private Queue queue = new Queue();

	public int getSize() {
		return queue.getSize();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void push(int element) {
		queue.enqueue(element);
	}

	public int pop() {
		int size = queue.getSize();
		if (size == 0) {
			throw new RuntimeException("Queue is Empty");
		}

		for (int i = size; i > 1; i--) {
			int element = queue.dequeue();
			queue.enqueue(element);
		}
		return queue.dequeue();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackWithSingleQueue stack = new StackWithSingleQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
