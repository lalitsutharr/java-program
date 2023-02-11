package day1;

public class operatorjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		//Arithematic operator +-/%
		System.out.println("sum of a and b:" +(a+b));
		System.out.println("sub of a and b:" +(b-a));
		System.out.println("mul of a and b:" +(a*b));
		System.out.println("div of a and b:" +(a/b));
		System.out.println("mod of a and b:" +(a%b));
		
		//relational operator/comparison
		
		System.out.println(a>b); //false
		System.out.println(b>a);  //true
		System.out.println(a!=b);  //true
		System.out.println(a<b);  //true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		
		//logical operator && || ! --true/false
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println( !y);
		
		a=100;
		//int res=a++; //post increament
		//int res=++a; //preincreament
		//System.out.println(res);
		System.out.println(a++); //100 101
		System.out.println(++a); //102
		
		b=100;
		//int res=b--;
		//int res=--b;
		//System.out.print(res);
		System.out.println(b--);
		System.out.println(--b);
		
		
		

	}

}
