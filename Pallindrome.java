package pallindrome;

public class Pallindrome {

	public static void main(String[] args) {
		int n = 1221;
		int b =n;
		int rem =0;
		int rev =0;
		while(n>=1) {
			rem = n%10;
			rev = rev *10 +rem;
			n = n/10;
		}
		if (b==rev) {
			System.out.println("No. is Pallindrome");
		}
		else {
			System.out.println("No.is not Pallindrome");
		}

	}

}
