package com.predefined.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {


	public static void main(String args[]){

	//Write a function to find length of given input string.

	Function<String, Integer> findLength= s -> s.length();
	System.out.println(findLength.apply("Aditya"));
	System.out.println("--------\n");

	//Program to remove spaces present in the given String by using Function
	Function<String, String> removeString= s -> s.replaceAll(" ", "");
	System.out.println(removeString.apply(" Aditya Yadav "));
	System.out.println("--------\n");

	//Program to find Number of spaces present in the given String by using Function
	Function<String, Integer> countSpace= s -> s.length() - s.replaceAll(" ", "").length();
	System.out.println(countSpace.apply("My name is Aditya"));
	System.out.println("--------\n");

	//Demo Program-1 for Function Chaining:
	Function<String, String> f1= s-> s.toUpperCase();
	Function<String, String> f2= s-> s.substring(0,6);

	System.out.println(f1.andThen(f2).apply("aditya yadav"));
	System.out.println(f1.compose(f2).apply("aditya Yadav"));

// f1.andThen(f2) => first f1 will be applied and then f2.
// f1.compose(f2) => first f2 will be applied and then f1.
	}

}