package polymorphism;


class Shape{
	void draw()
	{
		System.out.println("Draw");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Rectangle extends Shape {
	
	void draw() {
		System.out.println("Drawing Rectange");
	}

	public static void main(String[] args) {
		Shape s=new Circle();
		s.draw();
		
		Shape s1=new Rectangle();
		s1.draw();
	}
}
