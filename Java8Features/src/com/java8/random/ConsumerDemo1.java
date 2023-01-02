package com.java8.random;
import java.util.function.Consumer;

public class ConsumerDemo1 implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		
		System.err.println("Hello Mf, your number is here :"+t);
		
	}
	public static void main(String[] args) {
		
	
		new ConsumerDemo1().accept(66);
	}

}
