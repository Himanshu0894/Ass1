package length;

public class reverse {

	public static void main(String[] args) {
	int n = 12345;

	int rev = 0;
	int rem = 0;
	while(n>=1) {
		rem = n%10;
		rev = rev * 10 +rem;
		n = n/10;
	}
  
	   System.out.println(rev);
   
	
	}
}