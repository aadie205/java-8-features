package com.java8.lambdaInCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(25);
		set.add(5);
		set.add(20);

		System.out.println(set);

		TreeSet<Integer> set2 = new TreeSet<Integer>(
				(i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0);
		set2.add(10);
		set2.add(0);
		set2.add(15);
		set2.add(25);
		set2.add(5);
		set2.add(20);
		System.out.println(set2);
		
		
	}

}
