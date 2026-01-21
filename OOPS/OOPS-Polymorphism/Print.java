package polymorphism;

public class Print {

	void print(int a) {
		System.out.println(a);
	}
	
	void print(String a) {
		System.out.println(a);
	}
	
	void print(int a,String b) {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		Print p=new Print();
		p.print(3);
		p.print("Praveen");
		p.print(3,"Praveen");
	}

}
