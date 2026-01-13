package polymorphism;

public class Area {

	void area(int s) {
		System.out.println(s*s);
	}
	
	void area(int l,int b) {
		System.out.println(l*b);
	}
	
	void area(double r) {
		System.out.println((float)(r*r*Math.PI ));
	}
	
	public static void main(String[] args) {
		Area a=new Area();
		a.area(4);
		a.area(3,5);
		a.area(5.2);
	}
}
