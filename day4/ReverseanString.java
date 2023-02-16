package day4;

public class ReverseanString {
	
	public static void main(String[] args) {
		
		String s="Suthar";
		
		int len=s.length(); //6
		
		String rev="";
		
		for(int i=len-1;i>=0;i--) // 6 5 4 3 2 1
		{
			rev=rev+s.charAt(i); //r a h t u s
		}
		System.out.println("reverse string is "+ rev);
	}

}
