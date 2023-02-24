package day5;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void getValues(int id, String name,char g)//parameter/argument
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
	}

}
