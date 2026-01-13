
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		String a[]=in.split("");
		String rev="";
		for(int i=a.length-1;i>=0;i--)
			rev+=a[i];
		
		if(in.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
