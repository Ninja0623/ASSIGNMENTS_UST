

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(a+"*"+i+"="+(a*i));
	}

}
