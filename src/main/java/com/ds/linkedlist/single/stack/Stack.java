package com.ds.linkedlist.single.stack;

import com.ds.linkedlist.single.Node;

public class Stack<T> {

	private long size;
	private Node<T> top;

	public Stack() {
		this.size = 0;
		this.top = null;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public long getSize() {
		return size;
	}

	public void push(T data) {
		Node<T> element = new Node<T>(data, top);
		top = element;
		size++;
	}

	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		T data = top.getData();
		top = top.getNext();
		size--;
		return data;
	}

	public T top() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return top.getData();
	}
}
