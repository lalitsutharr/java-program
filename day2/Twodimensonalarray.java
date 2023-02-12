package day2;

public class Twodimensonalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a[][]=new int[3][2]; //Static array
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=100;
		a[1][1]=200;
		a[2][0]=100;
		a[2][1]=200;
		*/
		
		int a[][]= { {100,200},{300,400},{500,600}}; //dynamic array
       
		System.out.println("number of row:"+a.length); //number of row
		System.out.println("number of column:"+a[0].length); //number of column
	//classic loop	
		for(int i=0;i<a.length;i++) // i represent row index
		{
			for(int j=0;j<a[i].length;j++) //j column index
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//enhanced for loop
		/*for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i+" ");			
				
		}
		System.out.println();
		}*/

	}

}
