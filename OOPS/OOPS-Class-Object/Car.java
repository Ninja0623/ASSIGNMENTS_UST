package classobject;

public class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println(brand + " " + model + " " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda", "City", 1200000);
        Car c2 = new Car("Hyundai", "i20", 900000);
        c1.show();
        c2.show();
    }
}

