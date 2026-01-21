
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int e=0,o=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0)
				e++;
			else
				o++;
		}
		System.out.println("Even = "+e);
		System.out.println("Odd = "+o);
	}

}
