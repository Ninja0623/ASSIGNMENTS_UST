package exception;

public class NullPointerEg {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			
		}catch(NullPointerException e) {
			System.out.println("String should not be null");
		}
	}

}
