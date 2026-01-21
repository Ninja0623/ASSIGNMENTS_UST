package Inheritance;

class Bank{
	float interestRate;
}

public class SavingsAccount extends Bank{

	long balance;
	
	void calculateInterese() {
		System.out.println(balance*interestRate/100);
	}
	
	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
		s.balance=50000;
		s.interestRate=8.5f;
		
		s.calculateInterese();
	}

}
