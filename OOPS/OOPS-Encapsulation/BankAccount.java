package encapsulation;

public class BankAccount {
	
	private String accountName;
	private long balance;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		if(balance>=0)
			this.balance = balance;
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setAccountName("Praveen");
		b.setBalance(33000);
		System.out.println(b.getBalance());
	}

}
