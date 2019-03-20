package com.datastructuresandalgorithms.linkedlist;

import com.datastructuresandalgorithms.model.Node;

public class CircularlyLinkedList {
	// instance variables of the CircularlyLinkedList
	private Node<String> tail = null; // we store tail (but not head)
	private int size = 0; // number of nodes in the list

	public CircularlyLinkedList() {
	} // constructs an initially empty list

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String first() { // returns (but does not remove) the first element
		if (isEmpty())
			return null;
		return tail.getNext().getElement(); // the head is *after* the tail
	}

	public String last() { // returns (but does not remove) the last element
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void rotate() { // rotate the first element to the back of the 
		// list
		if (tail != null) // if empty, do nothing
			tail = tail.getNext(); // the old head becomes the new tail
	}

	public void addFirst(String e) { // adds element e to the front of the list
		if (size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail); // link to itself circularly
		} else {
			Node<String> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}

	public void addLast(String e) { // adds element e to the end of the list
		addFirst(e); // insert new element at front of list
		tail = tail.getNext(); // now new element becomes the tail
	}

	public String removeFirst() { // removes and returns the first element
		if (isEmpty())
			return null; // nothing to remove
		Node<String> head = tail.getNext();
		if (head == tail)
			tail = null; // must be the only node left
		else
			tail.setNext(head.getNext()); // removes ”head” from the list
		size--;
		return head.getElement();
	}

}
