package com.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list);

		//		Returns a stream consisting of the elements of this stream that match the given predicate.
		List<Integer> l2=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
//		 Returns a stream consisting of the results of applying the given function to the elements of this stream.
		List<Integer> l3=list.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(l3);
		
//		 @return the count of elements in this stream
		long count=list.stream().filter(m -> m>10).count();
		System.out.println(count);
		
		//No comparator
		List<Integer> l4=list.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		
		//comparator
		List<Integer> l5=list.stream().sorted((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(l5);
		
		//compareTo() for default natural sorting
		List<Integer> l6=list.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l6);
		
		//compareTo() for default natural sorting
		List<Integer> l7=list.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l7);
	}

}