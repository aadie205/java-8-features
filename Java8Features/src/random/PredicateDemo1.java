package com.java8.random;

import java.util.function.Predicate;

public class PredicateDemo1 implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {

		if (t % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
	 System.err.println(new PredicateDemo1().test(5));
	 System.err.println(new PredicateDemo1().test(8));
	}

}
