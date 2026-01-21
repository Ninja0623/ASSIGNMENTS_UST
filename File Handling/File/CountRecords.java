package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRecords {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			int count=0;
			while((ln=br.readLine())!=null)
			{
				count++;
			}
			System.out.println(count-1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}