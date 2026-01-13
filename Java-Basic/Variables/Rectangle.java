
import java.util.*;

public class Rectangle {
	
	static void Area(float l,float b)
	{
		System.out.println("Area of Rectangle : "+(l*b));
	}

	static void Perimeter(float l,float b)
	{
		System.out.println("Perimeter of Rectangle : "+(2*l*b));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length : ");
		float l=sc.nextFloat();
		System.out.print("Enter Breath: ");
		float b=sc.nextFloat();
		Area(l,b);
		Perimeter(l,b);
	}

}
