package classobject;

public class Order {
    int orderId;
    String customerName;
    double amount;
    double tax;

    Order(int orderId,String customerName,double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        tax = amount * 0.18;
    }

    void show() {
        System.out.println(orderId);
        System.out.println(customerName);
        System.out.println(amount);
        System.out.println(tax);
    }

    public static void main(String[] args) {
        Order o = new Order(1001,"Suresh",2000);
        o.show();
    }
}

