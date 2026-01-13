
import java.util.*;

public class SimpleInterest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal Amount: ");
		float P=sc.nextFloat();
		System.out.print("Enter Rate of Interest: ");
		float R=sc.nextFloat();
		System.out.print("Enter Number of Years: ");
		float N=sc.nextFloat();
		
		float SI = (N*P*R)/100;
		System.out.println("Simple Interest is "+SI);
	}
}
