package com.ds.linkedlist;

public class SingleLinkedListTest {

	public static void main(String[] args) {

		List<Integer> list = new SingleLinkedList<Integer>();
		System.out.println(list.toString());
		// System.out.println(list.get(0));
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(60);
		list.add(50);
		System.out.println(list);
		list.add(0, 5);
		list.add(2, 15);
		System.out.println(list);
		// list.add(500,8);
		// System.out.println(list.toString());
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(6));
		System.out.println(list.remove(6));
		System.out.println(list); 
		System.out.println(list.contains(5));
		System.out.println(list.contains(50));
		System.out.println(list.contains(30));
		
		
	}

}
