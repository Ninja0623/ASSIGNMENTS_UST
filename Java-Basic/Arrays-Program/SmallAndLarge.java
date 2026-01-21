
import java.util.*;

public class SmallAndLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		System.out.println("Smallest = "+a[0]);
		System.out.println("Largest = "+a[n-1]);
	}

}
