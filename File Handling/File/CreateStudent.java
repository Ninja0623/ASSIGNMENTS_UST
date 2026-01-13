package File;

import java.io.FileWriter;

public class CreateStudent {
    public static void main(String[] args) {
		FileWriter fw;
		try {
			fw=new FileWriter("src/Student.csv");
			fw.write("id,name,marks\n");
			fw.write("101,Ravi,78\n");
			fw.write("102,Anita,85\n");
			fw.write("103,Praveen,90\n");
			fw.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
