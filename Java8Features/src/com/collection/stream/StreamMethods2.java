package com.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Sunny Leone");
		list.add("Kajal Agarwal");
		list.add("Prabhas");
		list.add("Anushka Sharma");
		list.add("Mallika Shehrawat");

		System.out.println(list);

		// Default sorting
		List<String> sortedList = list.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sortedList);

//		using -ve sign
		List<String> sortedList1 = list.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sortedList1);

//		ascending order
		List<String> sortedList2 = list.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(sortedList2);

		// Sorting on based on length then ascending order
		Comparator<String> c = (s1, s2) -> {
			int i1 = s1.length();
			int i2 = s2.length();

			if (i1 < i2)
				return -1;
			else if (i1 > i2)
				return 1;
			else
				return s1.compareTo(s2);

		};

		List<String> customSort = list.stream().sorted((s1, s2) -> {
			int i1 = s1.length();
			int i2 = s2.length();

			if (i1 < i2)
				return -1;
			else if (i1 > i2)
				return 1;
			else
				return s1.compareTo(s2);
		}).collect(Collectors.toList());
		System.out.println(customSort);
	}

}
