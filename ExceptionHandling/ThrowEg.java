package exception;

public class ThrowEg {
	static void ageCheck(int age)throws Exception {
		if(age<18)
			throw new Exception("Age is invalid");
	}

	public static void main(String[] args) {
		try {
			ageCheck(17);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
