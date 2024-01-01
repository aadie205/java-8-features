package com.defaultAndStaticMethods;

interface Intref2{
	static void m1() {
		System.out.println("interface static method");
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {

		StaticMethodDemo d=new StaticMethodDemo();
//		d.m1();
//		StaticMethodDemo.m1();
		Intref2.m1();
	}

}
