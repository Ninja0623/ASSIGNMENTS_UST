package exception;

public class NextedTryCatch {

	public static void main(String[] args) {
		try {
			try {
				int a=10;
				int b=0;
				System.out.println(a/b);
			}catch(ArithmeticException e) {
				System.out.println("Divisor Cant be Zero");
			}
			
			String s=null;
			System.out.println(s.length());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
