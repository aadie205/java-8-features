package com.java8.random;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		Predicate<Integer> predict = (t)->{
			if(t%2==0)
				return true;
			else
				return false;
		};
		
		System.err.println(predict.test(66));
		System.err.println(predict.test(221));
	}
}
