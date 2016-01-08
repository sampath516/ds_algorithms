package com.ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		System.out.println(list.toString());
		// System.out.println(list.get(0));
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(60);
		list.add(50);
		System.out.println(list);
		list.add(0, 5);
		System.out.println(list);
		list.add(2, 15);
		System.out.println(list);
		// list.add(20,8);
		// list.add(-1,8);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(6));
		//list.get(-1);
		//list.get(7);
		System.out.println(list.remove(6));
		System.out.println(list); 
		System.out.println(list.remove(0));
		System.out.println(list); 
		System.out.println(list.remove(2));
		System.out.println(list); 
		//System.out.println(list.contains(10));
	//	System.out.println(list.contains(50));
		System.out.println(list.contains(20));
	}
	
}
