
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		int fact=1;
		for(int i=2;i<=a;i++)
			fact*=i;
		System.out.println(fact);
	}

}
