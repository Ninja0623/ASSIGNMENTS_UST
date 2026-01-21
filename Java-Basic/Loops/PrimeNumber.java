
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		int c=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
				c++;
		}
		if(c==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
