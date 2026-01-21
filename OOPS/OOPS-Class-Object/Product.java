package classobject;

public class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println(productId);
        System.out.println(productName);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Product p = new Product(10, "Mouse", 499);
        p.display();
    }
}
