package com.ds.linkedlist;

public class ArrayList<E extends Comparable<E>> implements List<E> {

	private static final int INTIAL_CAPACITY = 2;
	private int capacity = INTIAL_CAPACITY;
	private Object[] elementData = new Object[capacity];
	int size = 0; // Number of elements stored in the list

	@Override
	public List<E> add(E element) {
		add(size, element);
		return this;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForArray(index);
		if (size == capacity) {
			capacity *= 2;
			Object[] temp = new Object[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = elementData[i];
			}
			elementData = temp;
		}
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = element;
		size++;
	}

	@Override
	public E get(int index) {
		rangeCheckForArray(index);
		return elementData(index);
	}

	@SuppressWarnings("unchecked")
	private E elementData(int index) {
		return (E) elementData[index];
	}

	@Override
	public boolean isEmpty() {
		return (size <= 0);
	}

	@Override
	public E remove(int index) {
		rangeCheckForArray(index);
		E element = elementData(index);
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		elementData[size] = null;
		size--;
		return element;
	}

	@Override
	public void display() {
		this.toString();

	}

	@Override
	public boolean contains(E element) {
		return indexOf(element) >= 0;
	}

	@Override
	public int indexOf(E element) {
		if (element != null) {
			for (int i = 0; i < size; i++) {
				if (element.equals(elementData(i))) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (elementData[i] == null) {
					return i;
				}
			}
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		if (size <= 0) {
			return "";
		}
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < size; i++) {
			str.append(elementData[i]).append(", ");
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

	private void rangeCheckForArray(int index) {
		if ((index < 0) || (index > size)) {
			throw new IndexOutOfBoundsException("Index: " + index + ", "
					+ "Size: " + size);
		}
	}

}
