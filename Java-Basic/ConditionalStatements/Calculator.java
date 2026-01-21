
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numder 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter numder 2: ");
		int num2=sc.nextInt();
		
		System.out.print("Enter numder (+,-,*,/) Operator: ");
		char opr=sc.next().charAt(0);
		
		switch(opr) {
			case '+':
				System.out.println("Addition = "+(num1+num2));
				break;
			case '-':
				System.out.println("Subtraction = "+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication = "+(num1*num2));
				break;
			case '/':
				System.out.println("Division = "+(num1/num2));
				break;
			default:
				System.out.println("Invalid Operator");
		}
	}

}
