package capital;
import java.util.Scanner;
public class capital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String input = sc.nextLine();
		String capitalInput = "";
		capitalInput = capitalised(input);
		System.out.println(capitalInput);

	}
	public static String capitalised(String str) {
		str = str.toUpperCase();
		return str;
	}

}
