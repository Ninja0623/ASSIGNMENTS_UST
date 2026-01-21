package exception;

import java.util.Scanner;

class Validate extends Exception{
	Validate(String msg){
		super(msg);
	}
}

public class InputExcaptionValidation {
	
	static void ageValidate(int age) throws Validate {
		if(age<18)
			throw new Validate("Age Not Eligible");
		else
			System.out.println("Success");
	}

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		try {
			ageValidate(age);
		}catch(Validate e) {
			System.out.println(e.getMessage());
		}
	}

}
