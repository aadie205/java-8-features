package com.collection.stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMethods3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		System.out.println(list);
		list.stream().forEach(System.out::println);

		int min = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		int max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();

		System.out.println(min);
		System.out.println(max);

		list.stream().forEach(System.out::println);

		// takes one input and produce no result. uses accept(T t)
		Consumer<Integer> consumer = i -> {
			System.out.println("The sqare of " + i + " is " + i * i);
		};

		list.stream().forEach(consumer);

		Integer[] arr = list.stream().toArray(Integer[]::new);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Stream.of(arr).forEach(System.out::println);
		
		
	}

}
