
import java.util.Scanner;

public class LowerAndUpper {
	
	static void Upper(String a)
	{
		System.out.println(a.toUpperCase());
	}
	
	static void Lower(String a)
	{
		System.out.println(a.toLowerCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Text: ");
		String a=sc.nextLine();
		System.out.println("Choose option:");
		System.out.println("1. Convert to UpperCase");
		System.out.println("2. Convert to LowerCase");
		
		System.out.println("Enter choice : ");
		int c=sc.nextInt();
		if(c==1)
			Upper(a);
		else if(c==2)
			Lower(a);
		else
			System.out.println("Wrong Choice");
	}

}
