package day3;

public class NegandPossearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,-11,22,-13,-156};
		int size=a.length;
		System.out.println("array element are" +a.length);
		for(int i:a)
		{
			System.out.println(i);
		}
		
		for(int i:a)
		{
			if(i>0)
			{
				System.out.println("Number is Positive "+i);
			}
			else if(i<0)
				System.out.println("number is Negative"+i);
			else
			System.out.println( "zero"+i);
		}
		
		
		
		

	}

}
