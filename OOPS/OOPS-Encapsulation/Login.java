package encapsulation;

public class Login {

	private String email;
	private String password;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length()>=8)
			this.password = password;
	}

	public static void main(String[] args) {
		Login l=new Login();
		l.setEmail("praveen@gmail.com");
		l.setPassword("12345678");
	}

}
