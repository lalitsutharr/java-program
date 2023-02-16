package day4;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(0,4));
		
		//tolowercase & touppercase()
		
		s="Welcome";
		System.out.println(s.toUpperCase());
		
		s="WELCOME";
		System.out.println(s.toLowerCase());
		
		s="WELcome";
		System.out.println(s.toLowerCase()); //welcome
		System.out.println(s.toUpperCase()); //WELCOME
		
		

	}

}
