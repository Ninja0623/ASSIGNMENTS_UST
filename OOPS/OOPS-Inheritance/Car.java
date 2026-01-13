package Inheritance;

class Vehicle{
	int speed;
}

public class Car extends Vehicle {
	
	String brand;
	
	public static void main(String[] args) {
		Car c=new Car();
		c.speed=120;
		c.brand="GTR";
		
		System.out.println(c.brand);
		System.out.println(c.speed);
	}

}
