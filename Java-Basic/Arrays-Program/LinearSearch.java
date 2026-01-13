
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int ele=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele) {
				System.out.println("Element found in index "+i);
				System.exit(0);
			}
		}
		System.out.println("Element Not Found");
	}

}
