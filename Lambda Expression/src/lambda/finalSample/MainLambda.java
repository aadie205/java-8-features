package lambda.finalSample;

import lambda.innerClass.Arithmetic;

public class MainLambda {

	public static void main(String[] args) {
		Arithmetic ob1 = (int x, int y) ->  x + y;
		
		Arithmetic ob2 =  (int x, int y) -> { return x - y; };
			
		Arithmetic ob3 = (int x, int y) ->{return  x * y; };
			
		Arithmetic ob4 = (int x, int y) -> x / y;
			
		Arithmetic ob5 = (int x, int y) ->  x % y;

		System.out.println(ob1.process(7, 2));
		System.out.println(ob2.process(7, 2));
		System.out.println(ob3.process(7, 2));
		System.out.println(ob4.process(7, 2));
		System.out.println(ob5.process(7, 2));
	}

}
