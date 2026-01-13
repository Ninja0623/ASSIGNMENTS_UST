
import java.util.*;
public class PrimeOrNot {
	
	static void checkPrime(int n) {
		int c=0;
		for(int i=2;i<=n;i++)
			if(n%i==0)
				c++;
		
		if(c==1)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		checkPrime(a);
	}

}
