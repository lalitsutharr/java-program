package day4;

public class ArrayStringFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"lalit","Suthar","papa","mom","brother" };
		
		String value="pap";
		
		boolean flag=false;
		
		for(String i:s)
		{
			if(i.equals(value))
			{
			System.out.println("String has been found");
			flag=true;
			break;
			
		}
		}
		if(flag==false)
		{
			System.out.println("Sttring not found");
			
			
		}
			

	}

}
