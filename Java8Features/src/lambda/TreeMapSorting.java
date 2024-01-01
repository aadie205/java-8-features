package com.java8.lambdaInCollections;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(100, "Durga");
		map.put(600, "Sunny");
		map.put(300, "Bunny");
		map.put(200, "Chinny");
		map.put(700, "Vinny");
		map.put(400, "Pinny");

		System.out.println(map);

		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>(
				(i1,i2) ->(i1>i2)?-1:(i1<i2)?1:0);

		map2.put(100, "Durga");
		map2.put(600, "Sunny");
		map2.put(300, "Bunny");
		map2.put(200, "Chinny");
		map2.put(700, "Vinny");
		map2.put(400, "Pinny");

		System.out.println(map2);
		
//		Collections.sort(map, (i1,i2) ->(i1>i2)?-1:(i1<i2)?1:0);
	}

}
