
import java.util.*;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int a=sc.nextInt();
		
		if(a<0)
			System.out.println("Negative Number");
		else if(a>0)
			System.out.println("Positive Number");
		else
			System.out.println("Zero");
	}

}
