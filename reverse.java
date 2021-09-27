package reversestring;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Geekster is my class room";
		String []words=str.split(" ");
		String strrev="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			
			System.out.print(words[i]+" ");
			
		}

	}

}
