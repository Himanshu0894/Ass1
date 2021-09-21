
public class miss_num {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int arrsum =0;
		int n =15;
		int sum = (n*(n+1))/2;
		for(int i =0;i<arr.length;i++) {
			arrsum = arrsum + arr[i];
		}
		n = sum-arrsum;
		System.out.println(n);

	}

}
