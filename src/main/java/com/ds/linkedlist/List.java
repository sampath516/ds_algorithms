/**
 * 
 */
package com.ds.linkedlist;

/**
 * @author sampath
 * 
 */
public interface List<E extends Comparable<E>> {
	public List<E> add(E element);

	public void add(int index, E element);

	public E get(int index);

	public boolean isEmpty();

	public E remove(int index);

	public void display();

	public boolean contains(E element);

	public int indexOf(E element);

	public int getSize();

	public void removeDuplicates();
	
	public E findTheElementFromEnd(int offset);
	
	public void deleteElementInMiddle(E data);
	
	public void partitionListAround(E data);
	
	public boolean isPalindrome();
}
