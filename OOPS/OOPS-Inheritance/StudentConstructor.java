package Inheritance;

class Persons{
	String name;
	Persons(String name)
	{
		this.name=name;
	}
}

public class StudentConstructor extends Persons {

	int rollNo;
	StudentConstructor(int rollNo ,String name){
		super(name);
		this.rollNo=rollNo;
	}
	
	void disp() {
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollNo);
	}
	
	public static void main(String[] args) {
		StudentConstructor s=new StudentConstructor(49,"Praveen");
		s.disp();
	}

}
