package polymorphism;

public class Login {
	
	void login(String email) {
		System.out.println("Login Successful");
	}
	
	void login(String email,String password) {
		System.out.println("Login Successful");
	}

	public static void main(String[] args) {
			Login l=new Login();
			l.login("praveen@gmail.com");
			l.login("praveen@gmail.com","12345678");
	}

}
