
import java.util.*;

public class Swap {
	
	 static void tempSwap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("A = "+a+" B = "+b);
	}
	
	 static void swapWithoutTemp(int a,int b)
	 {
		 a=b+a;
		 b=a-b;
		 a=a-b;
		 System.out.println("A = "+a+" B = "+b);
	 }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value 1 : ");
		int a=sc.nextInt();
		System.out.print("Enter Value 2 : ");
		int b=sc.nextInt();
		
		System.out.println("Before Swap:");
		System.out.println("A = "+a+" B = "+b);
		System.out.println("After Swap using Temp:");
		tempSwap(a,b);
		System.out.println("After Swap without Temp:");
		swapWithoutTemp(a,b);
	}
}
