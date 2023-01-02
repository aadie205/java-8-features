package com.java8.lambdaInCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ListSorting {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 0, 15, 5, 20));
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

//		Collections.sort(list, new MyComparator());
//		System.out.println(list);
		
		Comparator<Integer> c= (i1, i2) ->  i1>i2 ? -1 : (i1<i2) ? 1 : 0;
//		Collections.sort(list, c);
//		System.out.println(list);
		
		Collections.sort(list, ((i1, i2) ->  i1>i2 ? -1 : (i1<i2) ? 1 : 0));
		System.out.println(list);
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1 > i2 ? -1 : (i1 < i2) ? 1 : 0;
	}
}