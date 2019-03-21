package com.datastructuresandalgorithms.exercices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
	public static void main(String[] a) {
		executebinarySearch();
		System.out.println("--------- ---------");
		hashMapImplementation();
		System.out.println("--------- ---------");
	}

	private static void executebinarySearch() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		int position = Collections.binarySearch(list, "C");
		System.out.println("Executing a binary search in List.");
		System.out.println("Position of 'C' item with binary search implementation: " + position);
	}

	private static void hashMapImplementation() {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");
		set.add("D");
		System.out.println("Added duplicate string [A, B, C, C, D] in a Set, but Set doesn't store repeated values: ");
		set.stream().forEach(System.out::println);
	}
}
