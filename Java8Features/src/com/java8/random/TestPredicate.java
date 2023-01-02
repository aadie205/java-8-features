package com.java8.random;
import java.util.function.Predicate;
import java.util.*;

class TestPredicate {
	public static void main(String args[]){
		
		Predicate<Integer> p=(i) -> (i>10);
		

		System.out.println(p.test(11));
		System.out.println(p.test(12));
		System.out.println();
	
		//1 Write a predicate to check the length of given string is greater than 3 or not.
		
		Predicate<String> p2=(s) -> s.length()>3;
		System.out.println(p2.test("Aditya"));
		System.out.println(p2.test("cat"));
		System.out.println("---------------------");

		//2 write a predicate to check whether the given collection is empty or not.
		Predicate<Collection> p3=(c) -> c.isEmpty();
		System.out.println(p3.test(new ArrayList(Arrays.asList(10,20,30))));
		System.out.println("---------------------");


		//Program to display names starts with 'K' by using Predicate
		String str[]={"Aditya", "Kumar", "Kajal", "Kundan", "Dinkar"};

		Predicate<String> p4=(s) -> s.startsWith("K");
		
		for(String s: str){
			if(p4.test(s))
				System.out.println(s);
		}
		System.out.println("---------------------");
		
		//Predicate Example to remove null values and empty strings from the given list

		String[] str2={"Aditya", null, "", "Yadav", " ", "Kumar"};

		Predicate<String> p5=(s) -> s!=null && s.length()!=0;
		
		List<String> list=new ArrayList<String>();

		for(String s: str2){
			if(p5.test(s)){
				list.add(s);
			}
		}
		list.stream().forEach(System.out::println);
	}
}