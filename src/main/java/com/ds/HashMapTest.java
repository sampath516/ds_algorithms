package com.ds;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer , Integer> map  = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(3, 33);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);
		map.put(7, 7);
		map.put(8, 8);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		System.out.println(map.get(5));
		System.out.println(map.get(6));
		System.out.println(map.get(7));
		System.out.println(map.get(8));
		///map.remove(1);
		//System.out.println(map.get(1));


		

	}

}
