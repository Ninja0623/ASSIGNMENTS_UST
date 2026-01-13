package classobject;

public class Mobile {
    String brand;
    int ram;
    int storage;
    double price;

    Mobile(String brand) {
        this.brand = brand;
    }

    Mobile(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    void print() {
        System.out.println(brand + " " + ram + "GB " + storage + "GB " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung");
        Mobile m2 = new Mobile("OnePlus", 8, 128, 42000);
        m1.print();
        m2.print();
    }
}

