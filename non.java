
public class non {

	public static void main(String[] args) {
		int arr[]= {20,10,30,10,30};
		int temp =0;
		for (int i=0;i<arr.length;i++) {
			temp = temp^arr[i];
		}
		System.out.println(temp);

	}

}
