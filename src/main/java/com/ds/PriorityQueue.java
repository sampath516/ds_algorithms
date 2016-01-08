package com.ds;

public class PriorityQueue<E extends Comparable<E>> {

	final static int DEFAULT_INITIAL_CAPACITY = 11;
	Object[] items = null;
	int size = 0;
	int capacity = DEFAULT_INITIAL_CAPACITY;

	public PriorityQueue() {
		items = new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	public void add(E item) {
		if (item == null) {
			throw new NullPointerException();
		}
		ensureCapacity();
		items[size++] = item;

		for (int i = size - 1, parent = (i - 1) / 2; parent >= 0;) {
			if (((E) items[parent]).compareTo((E) items[i]) < 0) {
				swap(parent, i);
				if (parent == 0) {
					break;
				}
				i = parent;
				parent = (parent - 1) / 2;
			} else {
				break;
			}
		}

	}

	private void ensureCapacity() {

		if (capacity == size) {
			capacity *= 2;
			Object[] tempItems = new Object[capacity];
			for (int i = 0; i < size; i++) {
				tempItems[i] = items[i];
			}
			items = tempItems;

		}

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			result.append(items[i]).append(", ");
		}
		if (size > 0) {
			result.delete(result.length() - 2, result.length() - 1);
		}
		result.append(']');
		return result.toString();
	}

	private void swap(int x, int y) {
		Object temp = items[x];
		items[x] = items[y];
		items[y] = temp;
	}

	@SuppressWarnings("unchecked")
	public E remove() {
		if (size == 0) {
			throw new RuntimeException("Priority Queue is empty");
		}
		E item = (E) items[0];
		items[0] = items[size - 1];
		size--;

		for (int i = 0, child = 2 * i + 1; child < size;) {
			// Determine which child is greater than the other
			if (((E) items[child]).compareTo((E) items[child + 1]) < 0) {
				child++;
			}
			// swap the parent with the child element
			if (((E) items[i]).compareTo((E) items[child]) < 0) {
				swap(i, child);
			} else {
				break;
			}
			if (child == 0) {
				break;
			}
			i = child;
			child = 2 * child + 1;
		}

		return item;
	}
}
