
import java.util.*;

public class Conversion {

	static void Fahrenheit(float C)
	{
		System.out.println("Fahrenheit of "+C+" Celcius is "+((C*9/5)+32f));
	}
	
	static void Miles(float KM)
	{
		System.out.printf("%.1f Kilo Meter = %.2f Miles",KM,(KM *0.62137));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Celcius : ");
		float C=sc.nextFloat();
		Fahrenheit(C);
		System.out.print("Enter Kilo Meter : ");
		float KM=sc.nextFloat();
		Miles(KM);
	}

}
