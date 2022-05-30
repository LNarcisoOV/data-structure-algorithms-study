package com.datastructuresandalgorithms.tree;

public class BinaryTree {

	private BinaryTreeNode root;

	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	public void traverseInOrder(BinaryTreeNode node) {
		if(node != null) {
			traverseInOrder(node.left);
			System.out.println(" " + node.value);
			traverseInOrder(node.right);
		}
	}
	
	public void traversePreOrder(BinaryTreeNode node) {
		if(node != null) {
			System.out.println(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}
	
	public void traversePostOrder(BinaryTreeNode node) {
		if(node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.println(" " + node.value);
		}
	}

	private BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			current = new BinaryTreeNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	private boolean containsNode(int value) {
		return containsRecursive(root, value);
	}

	private boolean containsRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.value) {
			return true;
		}

		return value < current.value ? containsRecursive(current.left, value) : containsRecursive(current.right, value);
	}

	private BinaryTreeNode deleteRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.value) {

			if (current.left == null && current.right == null) {
				return null;
			}

			if (current.left == null) {
				return current.right;
			}

			if (current.right == null) {
				return current.left;
			}

			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		}

		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		} else {
			current.right = deleteRecursive(current.right, value);
			return current;
		}

	}

	private int findSmallestValue(BinaryTreeNode root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
	
	public BinaryTreeNode getRoot() {
		return this.root;
	}

	class BinaryTreeNode {

		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int value) {
			this.value = value;
		}
	}

}
