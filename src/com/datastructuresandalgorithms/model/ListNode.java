package com.datastructuresandalgorithms.model;

public class ListNode<E> {
	private E element;
	private ListNode<E> next;

	public ListNode(E e, ListNode<E> n) {
		element = e;
		next = n;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E e) {
		this.element = e;
	}

	public ListNode<E> getNext() {
		return next;
	}

	public void setNext(ListNode<E> n) {
		this.next = n;
	}

}
