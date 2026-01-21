
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[]=sc.nextLine().split("");
		String check="";
		String dup="";
		for(int i=0;i<a.length;i++)
		{
			if(!check.contains(a[i]+","))
				check+=a[i]+",";
			else
				dup+=a[i]+",";
				
		}
		System.out.println("Duplicates :");
		System.out.println(dup.replace(',',' '));
	}

}
