package com.java8.random;
import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		
		Consumer<Integer> consum = (t) ->{	//Consumer<Integer> consum = t ->{
			System.err.println("Hello Mf, your number is here :"+t);
		};
		
		consum.accept(887);
	}
}
