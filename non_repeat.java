package non_repeat.java;

public class non_repeat {

	public static void main(String[] args) {
		int arr[]= {2,10,20,10,20,4};
		for(int i =0;i<arr.length;i++) {
		for(int j =i+1;j<arr.length;j++) {
			if((arr[i]^arr[j]) == 0) {
				arr[i]=0;
				arr[j]=0;
			}
		}

	}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}

}
}