package exception;

class Parent{
	void divide(int a,int b)throws ArithmeticException {
		System.out.println(a/b);
	}
}

class Child extends Parent{
	@Override
	void divide(int a,int b)throws ArithmeticException {
		System.out.println(a/b);
	}
}

public class ParentChild {

	public static void main(String[] args) {
		Parent p=new Child();
		try {
			p.divide(3, 0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
