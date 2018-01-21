import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {

	void readFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/WNDemo.java");

			//1. InputStream
			/*FileInputStream fis = new FileInputStream(file);
			
			int ch = 0;
			
			while((ch = fis.read()) != -1){
				System.out.print((char)ch);
			}
			
			fis.close();*/
			
			//2. Reader
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			int count = 0;
			// Source Code Analysis - Count the Objects created in source file
			
			while((line = buffer.readLine())!=null){
				if(line.contains("new")){
					count++;
				}
				System.out.println(line);
			}
			
			System.out.println("Total Objects Found: "+count);
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	void writeFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/Quotes1.txt");
			
			String q1 = "Be Exceptional !!\n";
			String q2 = "Work Hard, Get Luckier !!";
			
			//1. OutputStream
			/*FileOutputStream fos = new FileOutputStream(file,true); // true -> enable append mode
			fos.write(q1.getBytes());
			fos.write(q2.getBytes());
			
			fos.close(); // closing the stream to release the memory resources
			*/
			
			//2. FileWriter
			FileWriter writer = new FileWriter(file);
			writer.write(q1);
			writer.write(q2);
			
			writer.close();
			System.out.println("File Contents Written...");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		FileDemo fRef = new FileDemo();
		//fRef.readFile();
		fRef.writeFile();

	}

}
