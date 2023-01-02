package com.java8.random;

import java.util.function.Supplier;

public class SupplierDemo2 {

	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->{
		
			return "Hello Mf!!!";
		};
		
		System.err.println(supplier.get());
	}
}
