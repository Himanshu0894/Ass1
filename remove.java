package cont;

public class remove {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7};
		int tar = 5;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == 5) {
				continue;
			}	
		
		System.out.println(arr[i]);
		}
	}

}
