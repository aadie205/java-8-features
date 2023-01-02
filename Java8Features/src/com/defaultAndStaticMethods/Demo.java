package com.defaultAndStaticMethods;

interface Intref{
	default void m1() {
		System.out.println("Default method");
	}
}
public class Demo implements Intref{

	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		
		Test t=new Test();
		t.m1();
		
		Intref i=new Test();
		i.m1();
	}
	
	
}
class Test implements Intref{
	public void m1() {
		System.out.println("Test class method");
	}
}
