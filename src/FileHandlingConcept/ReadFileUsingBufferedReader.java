package FileHandlingConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferedReader {

	public static void main(String[] args) {
		
		// Read the file using BufferedReader
		String path = "C:\\Users\\dinne\\Downloads\\File Handles\\aajay.txt";
		BufferedReader br = null;
		
		try {
			
			File file = new File(path);
			 br= new BufferedReader(new FileReader(file));
			 
			 System.out.println("File content is: ");
			
			int c=0;
			while((c = br.read()) != -1){
				System.out.print((char)c);
				
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
