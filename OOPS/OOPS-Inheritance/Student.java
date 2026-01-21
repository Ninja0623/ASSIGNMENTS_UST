package Inheritance;

class Person{
	String name;
	int age;
}

public class Student extends Person {
	
	int rollNo;
	
	void display()
	{
		System.out.println("Name : "+name+"\n"+"Roll No. : "+rollNo+"\n"+"Age : "+age);
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.name="Praveen";
		s.age=22;
		s.rollNo=49;
		
		s.display();
	}
	
}
