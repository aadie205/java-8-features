package com.defaultAndStaticMethods;

class Test3 {
	public int m1() {

		return 0;
	}
//	public static int m1() {
//		
//	}

}

public class GeneralTest extends Test3 {
	
//	public String m1() {
//
//		return "";
//	}
	
//	public static m1() {
//		
//	}

	public static void main(String[] args) {
		
	}

}
interface I1{
	int i=1;
	int m1();
	
//	public default String toString() {
//		return "";
//	}
}
interface I2{
	int m1();
	default void m3() {
		
	}
	static int m4() {
		
		return 0;
	}
}
class C implements I1, I2{
	int c=I1.i;
	@Override
	public int m1() {
		System.out.println(I1.i);
		m3();
		I2.m4();
		return 0;
	}
	
}
class P{
	private void m1() {
		
	}
}
class Q extends P{
	public void m1() {
		
	}
}