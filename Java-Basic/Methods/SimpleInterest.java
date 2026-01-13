
import java.util.*;
public class SimpleInterest {
	
	static void SI(float p,float r,float y)
	{
		System.out.println("Simple Interest is "+(p*y*r)/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal : ");
		float p=sc.nextFloat();
		System.out.print("Enter rate of interest : ");
		float r=sc.nextFloat();
		System.out.print("Enter number of years : ");
		float y=sc.nextFloat();
		
		SI(p,r,y);
	}

}
