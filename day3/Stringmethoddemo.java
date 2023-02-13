package day3;

public class Stringmethoddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		int len=		s.length();
		System.out.println(len);
		//concat
		String s1="lalit";
		String s2="Suthar";
		System.out.println(s1.concat(s2));
				
		//trim()
         
		s="     Java programming      ";
		System.out.println(s);
		System.out.println(s.trim());
		
		//charAt()
		
		s="Welcome";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(3));
		
		//contain method
		System.out.println(s.contains("come"));
		System.out.println(s.contains("coe"));
		
		//equal() and  equalignorecase()
          s="Welcome";
        		System.out.println(  s.equals("Welcome"));
        		System.out.println(  s.equals("welcome"));
        		
        		System.out.println(  s.equalsIgnoreCase("Welcome"));
        		System.out.println(  s.equalsIgnoreCase("Welcome"));
        		
        		//replace
        		s="Hello lalit suthar How are you";
        		System.out.println(s.replace('e', 'l'));
        		
        		System.out.println(s.replace("Hello","xyz"));
        		
        		
	}

}
