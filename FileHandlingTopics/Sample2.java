package FileHandlingTopics;
import java.io.*;
public class Sample2 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\asbil\\OneDrive\\Desktop\\Sudhan\\Hello.text");
		FileWriter fr=new FileWriter(f,true);
		fr.write("Hello");
		fr.flush();
		fr.close();
		
		
	}
	

}
