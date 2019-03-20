package com.datastructuresandalgorithms.model;

public class Node<E> {
	private E element;
	private Node<E> next;

	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E e) {
		this.element = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> n) {
		this.next = n;
	}

}
