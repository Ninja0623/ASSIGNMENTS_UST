package Inheritance;

class Employee{
	int salary;
}

public class Manager extends Employee {
	
	int bonus;
	
	void calculateTotal() {
		System.out.println("Total : "+(bonus+salary));
	}

	public static void main(String[] args) {
		
		Manager m=new Manager();
		m.salary=33000;
		m.bonus=5000;
		m.calculateTotal();

	}

}
