package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class Validfile {
    static boolean isInteger(String n) {
		if(n==null)
			return false;
		try {
			Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			while((ln=br.readLine())!=null)
			{
				String dt[]=ln.split(",");
				if(isInteger(dt[2])) {
					for(String e:dt)
						System.out.print(e+" ");
					System.out.println();
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
