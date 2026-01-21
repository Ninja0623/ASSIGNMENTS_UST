
import java.util.*;
public class Factorial {

	static int Fact(int a) {
		if(a==0 || a==1)
			return a;
		return a*Fact(a-1);
	}
	
	public static void main(String[] args) {
		// 	TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int f=Fact(a);
		System.out.println("Factorial of "+a+" is "+f);
	}

}
