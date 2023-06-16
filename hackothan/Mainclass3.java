package hackothan;

public class Mainclass3 {
	public static String call(String word){
		word=word.replace("yak", "");
		return word;
	}
	public static void main(String[] args) {
		System.out.println(call("yakpakk"));
		
		
	}

}
