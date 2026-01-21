
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Year : ");
		int a=sc.nextInt();
		if((a%100!=0 && a%4==0) || a%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap year");
	}

}
