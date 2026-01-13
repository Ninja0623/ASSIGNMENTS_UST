
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		int x=0,y=1;
		System.out.print(x+","+y+",");
		for(int i=2;i<a;i++)
		{
			int z=x+y;
			System.out.print(z+",");
			x=y;
			y=z;
		}
		
	}

}
