package com.predefined.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalDemo {

	public static void main(String[] args) {
		
//	1. BiPredicate(I)
		
		//To check the sum of 2 given integers is even or not by using BiPredicate:
		BiPredicate<Integer, Integer> bp= (a,b) -> (a+b)%2==0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(15, 34));
		System.out.println();
		
		//To find product of 2 given integers by using BiFunction:
		BiFunction<Integer, Integer, Integer> bf= (a,b) ->  a*b;
		
		System.out.println(bf.apply(10, 15));
		System.out.println(bf.apply(20, 34));
		System.out.println();
		
		//Program to accept 2 String values and print result of
//		concatenation by using BiConsumer:
		
		BiConsumer<Integer, Integer> bc = (a, b) -> System.out.println("a: "+a + "	b: "+b);
		
		bc.accept(10, 20);
	}

}
