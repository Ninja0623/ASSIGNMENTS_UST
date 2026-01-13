package encapsulation;

public class ATM {
	
	private int pin;
	private long balance;
	
	public int getPin() {
		return pin;
	}

	public long getBalance() {
		return balance;
	}

	public void setPin(int pin) {
		if(String.valueOf(pin).length()==4)
			this.pin = pin;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void withdraw(long amount)
	{
		if(amount>balance)
			System.out.println("Insufficient Balance");
		else if(amount<0)
			System.out.println("Amount should not be less than zero");
		else
		{
			balance-=amount;
			System.out.println("WithDraw successful");
		}
	}
	public static void main(String[] args) {
		
		ATM a=new ATM();
		a.setPin(1234);
		a.setBalance(3500);
		System.out.println(a.getBalance());
		a.withdraw(500);
		System.out.println(a.getBalance());
	}

}
