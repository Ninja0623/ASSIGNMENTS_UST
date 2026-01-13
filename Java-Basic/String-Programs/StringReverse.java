
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[]=sc.nextLine().split("");
		String rev="";
		for(int i=a.length-1;i>=0;i--)
			rev+=a[i];
		
		System.out.println(rev);
	}

}
