package user_array;
import java.util.Scanner;
public class min_array {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number ");
    int arr[] = new int[5];
    for(int i=0;i<5;i++) {
    	arr[i]=sc.nextInt();
    }
    int min = Integer.MAX_VALUE;
    for(int i = 0;i<arr.length;i++) {
    	if(min>arr[i]) {
    		min=arr[i];
    	}
    }
    System.out.println(min);
    sc.close();
	}
}
