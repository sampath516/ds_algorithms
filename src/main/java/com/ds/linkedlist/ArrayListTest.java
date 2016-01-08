package com.ds.linkedlist;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.add(0, 5); 
		System.out.println(list);
		list.add(2, 25); 
		System.out.println(list);
		System.out.println(list.contains(5));
		System.out.println(list.contains(25));
		System.out.println(list.contains(40));
		System.out.println(list.contains(50));
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.remove(4));
		System.out.println(list);

		
	}

}
