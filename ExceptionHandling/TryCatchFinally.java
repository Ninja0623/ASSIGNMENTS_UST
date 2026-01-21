package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {

	public static void main(String[] args) throws IOException {
		File f=new File("src/Example.txt");
		FileReader fr=null;
		try {
			fr=new FileReader(f);
			int c;
			while((c=fr.read())!=-1) {
				System.out.print((char)(c));
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			fr.close();
		}
	}

}
