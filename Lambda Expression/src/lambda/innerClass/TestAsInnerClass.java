package lambda.innerClass;

public class TestAsInnerClass {
	public static void main(String[] args) {
		Arithmetic ob1 = new Arithmetic() {
			public float process(int x, int y) {
				return x + y;
			}
		};
		Arithmetic ob2 = new Arithmetic() {

			@Override
			public float process(int x, int y) {
				return x - y;
			}
		};
		Arithmetic ob3 = new Arithmetic() {

			@Override
			public float process(int x, int y) {
				return x * y;
			}
		};
		Arithmetic ob4 = new Arithmetic() {

			@Override
			public float process(int x, int y) {
				return x/y;
			}
		};
		Arithmetic ob5 = new  Arithmetic() {
			@Override
			public float process(int x, int y) {
				return x%y;
			}
		};
		
		System.out.println(ob1.process(7, 2));
		System.out.println(ob2.process(7, 2));
		System.out.println(ob3.process(7, 2));
		System.out.println(ob4.process(7, 2));
		System.out.println(ob5.process(7, 2));

	}
}
