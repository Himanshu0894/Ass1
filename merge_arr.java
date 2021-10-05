package merge_arr;

public class merge_arr {

	public static void main(String[] args) {
		int arr1[] = {4,5,6,7,8};
		int arr2[] = {1,2,3,4};
		int len = arr1.length + arr2.length;
		int arr3[] = new int[len];
		for (int i =0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
         for (int i =0; i<arr2.length; i++) {
        	 arr3[arr1.length + i] = arr2[i];
         }
         for(int i =0; i<len; i++) {
        	 System.out.println(arr3[i]+" ");
         }
	}

}
