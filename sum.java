package sum_multiply;
import java.util.Scanner;
public class sum {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number ");
	int a = sc.nextInt();
	System.out.println("Enter the Second Number ");
	int b = sc.nextInt();
	System.out.println("Chose operator");
	sc.nextLine();
	String oper = sc.nextLine();
	String sum = "+";
	String mul = "*";
	if(oper.equals(sum)) {
		int sum1 = add(a,b);
		System.out.println(sum1);
	}
	else {
		int pr = multi(a,b);
		System.out.println(pr);
	}
	sc.close();

	}
	public static int add(int a, int b) {
		int sum1 = a+b;
		return sum1;
	}
	public static int multi(int a, int b) {
		int pr = a*b;
		return pr;
	}
}
