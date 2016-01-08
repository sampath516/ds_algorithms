package com.algorithms.cache;

import java.util.HashMap;

import com.algorithms.cache.LinkedList.Node;

public class LRUCache<K, V> implements Cache<K, V> {

	private int capacity;
	private int size = 0;
	private LinkedList<K, V> list;
	private HashMap<K, Node<K, V>> map;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		list = new LinkedList<K, V>();
		map = new HashMap<K, Node<K, V>>();
	}

	public LRUCache() {
		this(5);
	}

	@Override
	public V get(K key) {
		// Search the hash map for the given key.
		// If available return it. Also move the node to the front of the list.
		Node<K, V> node = map.get(key);
		V value = null;
		if (node != null) {
			list.makeItFrontNode(node);
			value = node.value;
		}
		return value;
	}

	@Override
	public void put(K key, V value) {
		// Check whether the cache size is going to exceed the capacity.
		// If yes, remove the last node of the list. Also the remove the
		// entry from the hash map.
		if (size == capacity) {
			Node<K, V> node = list.remove();
			size--;
			map.remove(node.key);
		}
		// Add the node to the beginning of the list
		Node<K, V> node = new Node<K, V>(key, value, null, null);
		list.add(node);
		map.put(key, node);
		size++;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
