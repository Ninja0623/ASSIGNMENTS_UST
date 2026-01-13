package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class PassedStudents {
    public static void main(String[] args) {
		BufferedReader br;
		FileWriter fw;
		try {
			br=new BufferedReader(new FileReader("src/Student.csv"));
			fw=new FileWriter("src/NewStudent.csv");
			String ln;
			while((ln=br.readLine())!=null) {
				if(ln.contains("marks")) {
					fw.write(ln+"\n");
					continue;
				}
				String dt[]=ln.split(",");
				if(Integer.valueOf(dt[2])>=50)
					fw.write(ln+"\n");
			}
			fw.close();
			br.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
