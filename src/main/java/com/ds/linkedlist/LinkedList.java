package com.ds.linkedlist;

public class LinkedList<E extends Comparable<E>> implements List<E> {

	private Node<E> header;
	private int size = 0;

	LinkedList() {
		header = new Node<E>(null, null, null);
		header.previous = header;
		header.next = header;
	}

	@Override
	public List<E> add(E element) {
		Node<E> node = new Node<E>(element, header.previous, header);
		node.previous.next = node;
		header.previous = node;
		size++;
		return this;
	}

	@Override
	public void add(int index, E element) {

		if ((index < 0) || (index > size)) {
			throw new IndexOutOfBoundsException("Index: " + index + ", "
					+ "Size: " + size);
		}
		Node<E> pointer = header;
		int i = 0;
		while (i < index) {
			pointer = pointer.next;
			i++;
		}
		Node<E> node = new Node<E>(element, pointer, pointer.next);
		node.previous.next = node;
		node.next.previous = node;
		size++;
	}

	@Override
	public E get(int index) {
		if ((index < 0) || (index >= size)) {
			throw new IndexOutOfBoundsException("Index: " + index + ", "
					+ "Size: " + size);
		}
		Node<E> pointer = header;
		int i = 0;
		while (i <= index) {
			pointer = pointer.next;
			i++;
		}
		return pointer.data;
	}

	@Override
	public boolean isEmpty() {
		return size <= 0;
	}

	@Override
	public E remove(int index) {
		if ((index < 0) || (index >= size)) {
			throw new IndexOutOfBoundsException("Index: " + index + ", "
					+ "Size: " + size);
		}
		Node<E> pointer = header;
		int i = 0;
		while (i <= index) {
			pointer = pointer.next;
			i++;
		}
		E data = pointer.data;
		pointer.previous.next = pointer.next;
		pointer.next.previous = pointer.previous;
		return data;
	}

	@Override
	public void display() {
		System.out.println(toString());

	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) >= 0;
	}

	@Override
	public int indexOf(E element) {
		Node<E> pointer = header.next;
		if (element != null) {
			for (int i = 0; i < size; i++) {
				if (element.equals(pointer.data)) {
					return i;
				}
				pointer = pointer.next;
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (pointer.data == element) {
					return i;
				}
				pointer = pointer.next;
			}
		}
		return -1;

	}

	@Override
	public String toString() {
		if (size <= 0) {
			return "";
		}
		Node<E> temp = header.next;
		StringBuilder str = new StringBuilder();
		str.append("[");
		while (temp != header) {
			str.append(temp.data).append(", ");
			temp = temp.next;
		}
		str.delete(str.length() - 2, str.length() - 1);
		str.append("]");
		return str.toString();
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void removeDuplicates() {
		throw new RuntimeException("Method is not supported");
	}

	@Override
	public E findTheElementFromEnd(int offset) {
		throw new RuntimeException("Method is not supported");

	}

	@Override
	public void deleteElementInMiddle(E data) {
		throw new RuntimeException("Method is not supported");

	}
	
	@Override
	public void partitionListAround(E data) {
		throw new RuntimeException("Method is not supported");
		
	}

	@Override
	public boolean isPalindrome() {
		throw new RuntimeException("Method is not supported");
	}

	private static class Node<E> {
		E data;
		Node<E> previous;
		Node<E> next;

		Node(E element, Node<E> previous, Node<E> next) {
			this.data = element;
			this.previous = previous;
			this.next = next;
		}

	}

}
