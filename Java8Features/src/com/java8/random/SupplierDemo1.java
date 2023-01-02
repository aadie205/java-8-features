package com.java8.random;

import java.util.function.Supplier;

public class SupplierDemo1 implements Supplier<String> {

	@Override
	public String get() {
		return "Hello Mf!!!";
	}

	public static void main(String[] args) {
		System.err.println(new SupplierDemo1().get());
	}
}
