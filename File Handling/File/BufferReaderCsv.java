package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderCsv {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			while((ln=br.readLine())!=null)
			{
				String dt[]=ln.split(",");
				for(String e:dt)
					System.out.print(e+" ");
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
