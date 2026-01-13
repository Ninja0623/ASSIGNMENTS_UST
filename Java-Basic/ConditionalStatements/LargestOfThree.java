
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number1 : ");
		int a=sc.nextInt();
		System.out.print("Enter a Number2 : ");
		int b=sc.nextInt();
		System.out.print("Enter a Number3 : ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is Greatest");
		else if(b>c)
			System.out.println(b+" is Greatest");
		else
			System.out.println(c+" is Greatest");
	}

}
