package com.java8.random;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorStringCount {

	List<String> arr = new ArrayList<String>();

	public static void main(String[] args) {

		Map<?, Long> collect1 = Stream
				.of("Ever wondering what be could be a keyboard shortcut for something in eclipse".split(" "))
				.map(s -> s.replace("be", "Naveen"))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		for (Entry<?, ?> map : collect1.entrySet()) {
			System.err.println(map.getKey() + " : " + map.getValue());
		}

		ArrayList<String> collect2 = Stream.of("scan ", "left ", "too ").collect(ArrayList<String>::new,
				(l, r) -> l.add(r), ArrayList<String>::addAll);

		System.out.println(collect2);

		ArrayList<String> collect3 = Stream.of("scan ", "left ", "too ").collect(ArrayList<String>::new,
				(l, r) -> l.add(l.size() > 0 ? l.get(l.size() - 1) + r : r), ArrayList<String>::addAll);

		System.err.println(collect3);

	}
}