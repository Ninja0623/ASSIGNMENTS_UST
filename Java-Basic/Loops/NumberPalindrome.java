

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		
		int x=a,r=0;
		while(x>0)
		{
			int k=x%10;
			x/=10;
			r=(r*10)+k;
		}
		
		if(r==a)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
