package ascen_java;
import java.util.Scanner;
public class ascending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input ");
		int arr[] = new int[5];
		for(int i = 0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		@SuppressWarnings("unused")
		int temp;
		boolean flag = true;
		for(int i = 0;i<5-1;i++) {
			temp = arr[i+1];
			if(arr[i]>temp) {
				flag = false;
				break;
			}
			
		}
		if (flag==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
