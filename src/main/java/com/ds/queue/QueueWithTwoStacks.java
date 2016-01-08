package com.ds.queue;

import com.ds.stack.Stack;

public class QueueWithTwoStacks {

	private Stack stack1 = new Stack();
	private Stack stack2 = new Stack();

	public int getSize() {
		return stack1.getSize() + stack2.getSize();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public void enqueue(int n) {
		stack1.push(n);
	}

	public static void main(String[] args) {
		QueueWithTwoStacks queue = new QueueWithTwoStacks();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
