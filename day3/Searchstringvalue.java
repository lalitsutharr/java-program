package day3;

public class Searchstringvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Welcome","Java","selenion"};
		String num="Welcome";
		boolean flag=false;
		
		System.out.println("String in an array are:"+arr.length);
	       for(String i:arr)
	       {
	    	   System.out.println(i);
	       }
	       for(String i:arr)
	       {
	    	   if(i==num)
	    	   {
	       System.out.println("String found");
	         flag=true;
	         break;
	    	   }
	       
	    	   else
	    		   System.out.println("String not found");
	    	   flag=false;
		
	       }
	

	}
}
