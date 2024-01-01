package com.java8.random;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {

		Predicate<Integer> predict = (t) -> {
			if (t % 2 == 0)
				return true;
			else
				return false;
		};

		// Now here, Will see how some method takes arguments as consumer type
		List<Integer> list = Arrays.asList(22, 55, 33, 8, 23, 77, 99, 12, 55, 10);

		//System.err.println(list.stream().filter(predict)); // filter(predict.test(list)); //
	
	list.stream().filter(predict).forEach(t->System.err.println(t));
		
	list.stream().filter((t) -> {
			if (t % 2 == 0)
				return true;
			else
				return false;
		}).forEach(System.out::println);;

	}
}
