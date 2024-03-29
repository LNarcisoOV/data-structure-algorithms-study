package com.datastructuresandalgorithms.linkedlist;

import com.datastructuresandalgorithms.model.ListNode;

public class SinglyLinkedList<E> {

	// instance variables of the SinglyLinkedList
	private ListNode<E> head = null; // head node of the list (or null if empty)
	private ListNode<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	public SinglyLinkedList() {
	} // constructs an initially empty list

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() { // returns (but does not remove) the first element
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public E last() { // returns (but does not remove) the last element
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) { // adds element e to the front of the list
		head = new ListNode<>(e, head); // create and link a new node
		if (size == 0)
			tail = head; // special case: new node becomes tail also
		size++;
	}

	public void addLast(E e) { // adds element e to the end of the list
		ListNode<E> newest = new ListNode<>(e, null); // node will eventually be the
												// tail
		if (isEmpty())
			head = newest; // special case: previously empty list
		else
			tail.setNext(newest); // new node after existing tail
		tail = newest; // new node becomes the tail
		size++;
	}

	public E removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		E answer = head.getElement();
		head = head.getNext(); // will become null if list had only one node
		size--;
		if (size == 0)
			tail = null; // special case as list is now empty
		return answer;
	}

}
