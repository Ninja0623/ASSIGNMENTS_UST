
import java.util.*;

public class MaxOfTwo {
	
	static void Max(int a,int b)
	{
		if(a>b)
			System.out.println(a+" is Greatest");
		else
			System.out.println(b+" is Greatest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Max(a,b);
	}

}
