package FileHandlingTopics;

import java.io.*;

public class Sample {
	public static void main(String[]args) throws IOException
	{
		File f= new File("C:\\Users\\asbil\\OneDrive\\Desktop\\Sudhan\\Hello.text");
		f.mkdir();
		System.out.println(f.exists());
		f.delete();
		System.out.println(f.exists());
		f.createNewFile();
		
		
		
	}

}
