package exception;

class InvalidNameException extends Exception {
    InvalidNameException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class Service{
	void validateUser(String name,int age)throws InvalidNameException,InvalidAgeException {
		if(name==null||name.trim().length()==0)
			throw new InvalidNameException("Name is Empty");
		else if(age<18)
			throw new InvalidAgeException("Age should be greater than or equal to 18");
		System.out.println("User Validation Successful");
	}
}

public class ValidationLayer {

	public static void main(String[] args) {
		Service s=new Service();
		try {
			s.validateUser("", 18);
		}catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
