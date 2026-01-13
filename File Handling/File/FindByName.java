package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindByName {
    public static void main(String[] args) {
		BufferedReader br;
		String key="praveen";
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			while((ln=br.readLine())!=null)
			{
				String dt[]=ln.split(",");
				if(dt[2].equals("marks"))
				{
					for(String e:dt)
						System.out.print(e+" ");
					System.out.println();
				}
				if(dt[1].equalsIgnoreCase(key))
				{
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
