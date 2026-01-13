package polymorphism;

class Bank{
	void getInterestRate() {
		System.out.println(8.2);
	}
	
}

class SBI extends Bank{
	void getInterestRate() {
		System.out.println(6.2);
	}
}

public class HDFC extends Bank{

	void getInterestRate() {
		System.out.println(7.6);
	}
	
	public static void main(String[] args) {
		Bank b=new SBI();
		b.getInterestRate();
		b=new HDFC();
		b.getInterestRate();
	}

}
