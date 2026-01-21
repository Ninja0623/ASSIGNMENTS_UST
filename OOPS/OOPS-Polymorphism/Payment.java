package polymorphism;

public class Payment {

	void pay(int amount) {
		System.out.println("Amount : "+amount);
	}
	
	void pay(int amount,String mode) {
		System.out.println("Amount : "+amount+"\n"+"Mode : "+mode);
	}
	
	public static void main(String[] args) {
		Payment p=new Payment();
		p.pay(10000);
		p.pay(10000,"Online");
	}

}
