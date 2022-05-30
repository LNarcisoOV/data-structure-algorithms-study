package com.datastructuresandalgorithms.tree;

public class TreeMain {

	public static void main(String...strings ) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("--------------------------TREE-----------------------------");
		System.out.println("Tree is a hyrarchical data structure, isnt linear like arrays, list or queues.");
		System.out.println("In a tree, each value is know as node, the topmost node is known as root.");
		System.out.println("Each node has its own data and the link or reference of its other nodes, called children.");
		System.out.println("Difference between tree and binary tree:");
		System.out.println("   tree can have multiples childs per node while "
				+ "\n   binary tree can have only two children per node");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		System.out.println("-------------------BINARY TREE-----------------------------");
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.add(1);
		binaryTree.add(3);
		binaryTree.add(2);
		binaryTree.add(1);
		binaryTree.add(6);
		binaryTree.add(15);
		binaryTree.add(10);
		binaryTree.add(12);
		binaryTree.add(7);
		
		
		System.out.println("-------------------TRAVERSE IN PRE ORDER -----------------------------");
		binaryTree.traversePreOrder(binaryTree.getRoot());
		
		System.out.println("-------------------TRAVERSE IN ORDER -----------------------------");
		binaryTree.traverseInOrder(binaryTree.getRoot());
		
		System.out.println("-------------------TRAVERSE POST ORDER -----------------------------");
		binaryTree.traversePostOrder(binaryTree.getRoot());
		
	}
}
