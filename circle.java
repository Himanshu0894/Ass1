package circle;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		int a = sc.nextInt(); 
		sc.close();
		System.out.println("The Area is " +area(a));
		System.out.println("The circumference is "+circum(a));
	}
	public static double area(int a) {
		return ((Math.PI)*a*a);
	}
	public static double circum(int a) {
		return (2*(Math.PI)*a);
	}


}