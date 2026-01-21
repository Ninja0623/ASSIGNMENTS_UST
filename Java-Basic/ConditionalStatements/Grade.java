
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the mark: ");
		int mark=(int)(sc.nextFloat());
		
		if(mark>=90)
			System.out.println("A");
		else if(mark>=75)
			System.out.println("B");
		else if(mark>=60)
			System.out.println("C");
		else
			System.out.println("Fail");
	}

}
