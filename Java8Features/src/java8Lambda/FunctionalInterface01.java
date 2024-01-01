package com.java8.lambda;

public class FunctionalInterface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

@FunctionalInterface
interface A{
	void add();
}
@FunctionalInterface
interface B extends A{
	void add();
}