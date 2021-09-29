package practise_add;
import java.util.Scanner;
public class add_multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a = sc.nextInt();
		System.out.println("Enter the second number ");
		int b = sc.nextInt();
		sc.close();
		System.out.println("Addition of a and b is " + add(a,b));
		System.out.println("Multiplication of a and b is " + multiply(a,b));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}

}
