package com.predefined.functionalInterface;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Integer[] a= {1,2,3,4,5,6,7};
		
//		Consumer<Integer[]> c= i -> Stream.of(i).forEach(System.out::println);
		Consumer<Integer> c= i -> System.out.print(i);;
		c.accept(5);

		System.out.println();
		Consumer<Integer[]> c2= (Integer p[] )->{ for(Integer i: p) System.out.println(i); };
		
		c2.accept(a);
		
	}

}