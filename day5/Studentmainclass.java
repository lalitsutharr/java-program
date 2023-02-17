package day5;

public class Studentmainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1=new Student(); //stu1 is object reference variable
		//approach1
		
		/*stu1.sid=100;
		stu1.sname="lalit";
		stu1.grade='A'*/
		
		
		//Approach2-using method
		
		stu1.getValues(111, "lalittt", 'A');
		
		stu1.display();
		
		
		
		

	}

}
