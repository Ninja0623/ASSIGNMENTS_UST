package array;
import java.util.*;
public class ArrayPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// TODO Auto-generated method stub
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i:a)
			System.out.println(i);
		
	}

}
