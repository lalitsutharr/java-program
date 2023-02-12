package day2;

public class SearchelemenetinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,200,100,50,70,30};
		int num=10;
		
		boolean flag=false;
		
		for(int i:a)
		{
			//System.out.println(i);
		if(i==num)
		{
			System.out.println("elementfound");
			flag=true;
			break;
		}
		}
		if(flag==false)
		{
			
		
           System.out.println("element not found");
	}
		}

}
