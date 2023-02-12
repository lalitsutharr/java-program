package day2;
/* 1 declare an array
 * insert value into array
 * find size of array
 * read the value of array
 */

public class SingledimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int a[]=new int[5]; //declaration
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//-----------static array
		
		//int a[]= {100,200,300,400,500}; //decalred array without specifing size -dynamic array
		
		
		System.out.println(a.length);//size of array
		
		//System.out.println(a[2]); //extract specify value from array
		
		
		
		//for each loop/enhance loop
		for(int i:a)
		{
			System.out.println(i);
		}
		
		//classic loop
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		

	}

}
