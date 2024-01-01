package com.java8.random;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo3 {

	public static void main(String[] args) {
		
		Consumer<Integer> consum = (t) ->{	//Consumer<Integer> consum = t ->{
			System.err.println("Hello Mf, your number is here :"+t);
		};
		
		consum.accept(875768790);
		
		//Now here, Will see how some method takes arguments as consumer type
		List<Integer> list = Arrays.asList(22, 55, 33, 8, 23, 77, 99, 12, 55, 10);
		
		list.stream().forEach(consum); // list.stream().forEach(consum.accept(list));  [internally happening]
		//One more level by providing implementation of consumer functional interface by lambda experssion
		list.stream().forEach((t) ->{	System.out.println("Hello Mf, your number is here :"+t); });
		
		
	}
}
