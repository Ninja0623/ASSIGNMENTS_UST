package File;

import java.io.BufferedReader;
import java.io.FileReader;

public class AverageMarks {

	public static void main(String[] args) {
		BufferedReader br;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			String ln;
			int count=0,sum=0;
			float avg=0;
			while((ln=br.readLine())!=null)
			{
				if(ln.contains("marks"))
					continue;
				String dt[]=ln.split(",");
				sum+=Integer.valueOf(dt[2]);
				count++;
			}
			avg=sum/count;
			System.out.println("Average Mark = "+avg);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}