package com.ds.linkedlist.single;

public class SingleLinkedListUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] values = { 4, 8, 2, 10, 7 };
		// Node<Integer> head = createSingleLinkedList(values);
		// printLinkedList(head);
		// head = reverseLinkedList(head);
		// printLinkedList(head);

		// int[] values = { 4, 8, 2, 10, 7 };
		// Node<Integer> head = createSingleLinkedList(values);
		// printLinkedList(head);
		// Node<Integer> mid = findMiddleElementInSingleLinkedList(head);
		// System.out.println("Middle Element: " + mid.getData());

//		int[] values = { 4, 8, 2, 10, 7 };
//		Node<Integer> head = createSingleLinkedList(values);
//		head.getNext().getNext().getNext().getNext()
//				.setNext(head.getNext().getNext());
//		// printLinkedList(head);
//		Node<Integer> result = detectLoopInSingleLinkedList_v1(head);
//		System.out.println("Detected loop: " + result.getData());
		
		int[] values = { 4, 8, 2, 10, 7 };
		Node<Integer> head = createSingleLinkedList(values);
		head.getNext().getNext().getNext().getNext()
				.setNext(head.getNext());
		// printLinkedList(head);
		Node<Integer> result = detectLoopInSingleLinkedList_v2(head);
		System.out.println("Detected loop: " + result.getData());
	}

	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> pointer = head;
		System.out.println("******************************************");
		while (pointer != null) {
			System.out.print(pointer.getData() + ",");
			pointer = pointer.getNext();
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}

	public static Node<Integer> createSingleLinkedList(int[] values) {

		Node<Integer> head = new Node<Integer>(values[0], null);
		Node<Integer> pointer = head;
		for (int i = 1; i < values.length; i++) {
			Node<Integer> element = new Node<Integer>(values[i], null);
			pointer.setNext(element);
			pointer = element;
		}
		return head;
	}

	public static Node<Integer> reverseLinkedList(Node<Integer> head) {

		// If list is empty or contains only one element, do nothing
		if (head == null || head.getNext() == null) {
			return head;
		}

		Node<Integer> previous = null;
		Node<Integer> current = head;

		while (current != null) {
			Node<Integer> next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

	public static Node<Integer> findMiddleElementInSingleLinkedList(
			Node<Integer> head) {

		if (head == null || head.getNext() == null) {
			return head;
		}
		Node<Integer> mid = head;
		Node<Integer> temp = head;
		int size = 1;
		while (temp != null) {
			temp = temp.getNext();
			if (size % 2 == 0) {
				mid = mid.getNext();
			}
			size++;
		}
		return mid;
	}

	/**
	 * Multiple Loops
	 */
	public static Node<Integer> detectLoopInSingleLinkedList_v1(
			Node<Integer> head) {

		if (head == null || head.getNext() == null) {
			return null;
		}

		Node<Integer> pointer2 = head.getNext();

		while (pointer2.getNext() != null) {
			Node<Integer> pointer1 = head;
			while (pointer1 != pointer2) {
				if (pointer2.getNext() == pointer1) {
					return pointer1;
				}
				pointer1 = pointer1.getNext();
			}
			pointer2 = pointer2.getNext();
		}

		return null;
	}

	/**
	 * Floyd’s Cycle-Finding Algorithm
	 */
	public static Node<Integer> detectLoopInSingleLinkedList_v2(
			Node<Integer> head) {

		if (head == null || head.getNext() == null) {
			return null;
		}

		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;

		while (slowPointer != null && fastPointer != null
				&& fastPointer.getNext() != null) {
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			if (slowPointer == fastPointer) {
				return slowPointer;
			}
		}

		return null;
	}
}
