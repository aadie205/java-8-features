package com.java8.lambda;

public class LambdaExpression01  {

	public static void main(String[] args) {
		
		//without using lambda expression
		Intref i=new Demo();
		i.m1();

		//with lambda expression
		Intref i1= () -> System.out.println("m1() method lambda Impl");
		i1.m1();
		
		Intref2 i2= (a, b) -> System.out.println("sum: "+ (a+b));
		i2.add(2, 3);
		
		Intref3 i3= s -> s.length();
		System.out.println(i3.getLength("Aditya"));
		
		Intref4 i4= x ->  x*x;
		System.out.println(i4.squareIt(10));
		System.out.println(i4.squareIt(20));
	}

}
interface Intref4{
	public int squareIt(int x);
}
interface Intref3{
	public int getLength(String s);
	
}
interface Intref2{
	public void add(int a, int b);
}
interface Intref{
	public void m1();
}
class Demo implements Intref{
	public void m1() {
		System.out.println("m1() method normal Impl");
		
	}
	
}