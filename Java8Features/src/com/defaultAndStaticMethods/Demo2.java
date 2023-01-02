package com.defaultAndStaticMethods;

interface Left{
	default void m1() {
		System.out.println("Left interface method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right interface method");
	}
}
public class Demo2 implements Left, Right{
	
	public void m1() {
		System.out.println("Demo class method");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.m1();
	}

}
