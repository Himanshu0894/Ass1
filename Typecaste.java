package hello;
import java.util.Scanner;
public class Typecaste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		int a =sc.nextInt();
		System.out.println("Enter the float");
		float b =sc.nextFloat();
		System.out.println("Enter the byte");
		byte c = sc.nextByte();
	
		sc.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
