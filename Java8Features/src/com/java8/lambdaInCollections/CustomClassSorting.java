package com.java8.lambdaInCollections;

import java.util.ArrayList;
import java.util.Collections;

public class CustomClassSorting {

	public static void main(String[] args) {
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(200, "Deepika"));
		list.add(new Employee(400, "Sunny"));
		list.add(new Employee(300, "Mallika"));
		list.add(new Employee(100, "Katrina"));
		
		System.out.println("Before sorting");
		System.out.println(list);
		
		Collections.sort(list, (e1, e2) -> (e1.eno< e2.eno)?-1:(e1.eno>e2.eno)?1:0 );
		System.out.println("\nAfter Asce sorting: ");
		System.out.println(list);
		
		Collections.sort(list, (e1,e2) -> (e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("\nAfter Desc sorting: ");
		System.out.println(list);
	}

}

class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + " : " + ename;
	}
}