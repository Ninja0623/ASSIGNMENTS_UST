
import java.util.*;
public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] a=sc.nextLine().toLowerCase().toCharArray();
		int v=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
				v++;
			else
				c++;
		}
		System.out.println("Vowels = "+v);
		System.out.println("Consonent = "+c);
	}

}
