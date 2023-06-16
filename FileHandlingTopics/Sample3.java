package FileHandlingTopics;
import java.io.*;
public class Sample3 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\asbil\\OneDrive\\Desktop\\Sudhan\\Hello.text");
		FileReader fr=new FileReader(f);
		char arr[]=new char[(int) f.length()];
		fr.read(arr);
		for(char c:arr){
			System.out.print(c);
		}
		
	}

}
