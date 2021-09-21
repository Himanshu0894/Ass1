
public class max_min {

	public static void main(String[] args) {
		 int []arr = {18,23,56,11,87,96};
	       int max =Integer.MIN_VALUE;
	      
	       for(int i=0;i<arr.length;i++) {
	      
	       if (max<arr[i]) {
	    	   max = arr[i];
	       }
	       
	       
		}
	       System.out.println(max);
	       int min =Integer.MAX_VALUE;
	       for(int i =0;i<arr.length;i++) {
	    	   if (min>arr[i]) {
	    		   min=arr[i];
	    	   }
	       }
         System.out.println(min);
	}

}
