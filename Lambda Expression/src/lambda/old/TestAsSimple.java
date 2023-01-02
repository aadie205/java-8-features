package lambda.old;

public class TestAsSimple {

	public static void main(String[] args) {
		Arithmetic ob1=new Addition();
		Arithmetic ob2=new Substraction();
		Arithmetic ob3=new Multiplication();
		Arithmetic ob4=new Division();
		Arithmetic ob5=new Modulous();
		
		System.out.println(ob1.process(7, 2));
		System.out.println(ob2.process(7, 2));
		System.out.println(ob3.process(7, 2));
		System.out.println(ob4.process(7, 2));
		System.out.println(ob5.process(7, 2));

	}

}
