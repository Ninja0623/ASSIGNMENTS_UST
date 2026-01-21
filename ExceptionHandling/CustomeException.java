package exception;

import java.util.Scanner;

class InvalidBalanceException extends Exception{
	InvalidBalanceException(String msg){
		super(msg);
	}
}

public class CustomeException {

	static final int minimumBalance=1000;
	static int balance=2500;
	
	static void checkMinimum(int amount) throws InvalidBalanceException {
		if(balance-amount<minimumBalance) 
			throw new InvalidBalanceException("Your Balance hit minimum balance");
		else
			balance-=amount;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		int a=sc.nextInt();
		try {
			checkMinimum(a);
		}catch(InvalidBalanceException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(balance);
		}
	}

}
