package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class Toppers {
    public static void main(String[] args) {
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			int max=0;
			while((ln=br.readLine())!=null)
			{
				String dt[]=ln.split(",");
				if(ln.contains("marks"))
				{
					continue;
				}
				int i=Integer.valueOf(dt[2]);
				if(i>max)
					max=i;
			}
			br.close();
			br=new BufferedReader(new FileReader("src/Student.csv"));
			while((ln=br.readLine())!=null) {
				String dt[]=ln.split(",");
				if(dt[2].equals(String.valueOf(max)))
				{
					for(String i:dt)
						System.out.print(i+" ");
					System.out.println();
				}
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

    
}
