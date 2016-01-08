package com.algorithms.cache;

import com.algorithms.cache.LinkedList.Node;

public class LRUCacheTest {

	public static void main(String[] args) {

//		LinkedList<Integer, String> list = new LinkedList<Integer, String>();
//		Node<Integer, String> node = new Node<Integer, String>(1, "One", null, null);
//		list.add(node);
//		node = new Node<Integer, String>(2, "Two", null, null);
//		list.add(node);
//		node = new Node<Integer, String>(3, "Three", null, null);
//		list.add(node);
//		Node<Integer, String>  node4 = new Node<Integer, String>(4, "Four", null, null);
//		list.add(node4);
//		node = new Node<Integer, String>(5, "Five", null, null);
//		list.add(node);
//		node = new Node<Integer, String>(6, "Six", null, null);
//		list.add(node);
//		System.out.println(list.toString());
//		list.remove();
//		list.remove();
//		System.out.println(list.toString());
//		list.makeItFrontNode(node4);
//		System.out.println(list.toString());
		
		LRUCache<Integer, String> cache = new LRUCache<Integer, String>();
		cache.put(1, "One"); 
		cache.put(2, "Two");
		cache.put(3, "Three");
		cache.put(4, "Four");
		cache.put(5, "Five");
		System.out.println(cache.toString());
		cache.put(6, "Six");
		System.out.println(cache.toString());
		cache.put(7, "Seven");
		System.out.println(cache.toString());
		cache.get(4); 
		System.out.println(cache.toString());
		cache.get(3); 
		System.out.println(cache.toString());
		
	}

}
