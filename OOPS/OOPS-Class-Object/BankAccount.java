package classobject;

public class BankAccount {
    long accountNumber;
    String holderName;
    double balance;

    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456, "Kumar", 5000);
        b.showAccount();
    }
}
