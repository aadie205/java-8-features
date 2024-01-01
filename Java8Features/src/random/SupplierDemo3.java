package com.java8.random;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo3 {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> {

			return "Hello Mf!!!";
		};

		System.out.println(supplier.get());

		// List<String> list1 = Arrays.asList("a","b");
		List<String> list1 = Arrays.asList();

		System.err.println(list1.stream().findAny().orElseGet(supplier));
		System.out.println(list1.stream().findAny().orElseGet(() -> {
			return "Hello Mf!!!";
		}));

	}
}
