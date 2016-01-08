package com.algorithms.cache;

class LinkedList<K, V> {

	private Node<K, V> header;

	public LinkedList() {
		header = new Node<K, V>(null, null, null, null);
		header.previous = header;
		header.next = header;
	}

	/**
	 * Add the node to the beginning of the list
	 * 
	 */
	public void add(Node<K, V> node) {
		node.next = header.next;
		node.previous = header;
		header.next = node;
		node.next.previous = node;
	}

	/**
	 * Remove the last node from the list
	 */
	public Node<K, V> remove() {
		Node<K, V> node = header.previous;
		node.previous.next = header;
		header.previous = node.previous;
		return node;
	}

	private void remove(Node<K, V> node) {
		node.previous.next = node.next;
		node.next.previous = node.previous;
	}

	/**
	 * Removes the node from the list and adds it to the beginning of the list
	 * 
	 * @param node
	 */
	public void makeItFrontNode(Node<K, V> node) {
		remove(node);
		add(node);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Node<K, V> pointer = header.next; pointer != header; pointer = pointer.next) {
			sb.append(pointer.value.toString() + ", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		return sb.toString();
	}

	static class Node<K, V> {
		K key;
		V value;
		Node<K, V> previous;
		Node<K, V> next;

		Node(K key, V value, Node<K, V> previous, Node<K, V> next) {
			this.key = key;
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}

}
