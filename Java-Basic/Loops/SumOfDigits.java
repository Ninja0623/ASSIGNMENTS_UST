

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int k=a%10;
			sum+=k;
			a/=10;
		}
		System.out.println("Sum = "+sum);
	}

}
