package classA;

public class classA {

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void add (double a, double b) {
		System.out.println(a+b);
	}
	public void show() {
		add(5,8);
		add(2,7,9);
		add(3.99,4.87);
	}

}
