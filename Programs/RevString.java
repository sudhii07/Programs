package Programs;

public class RevString {
public static void main(String[] args){
	String str="hoga beda hudugi nan bittu";
	for(int i=str.length()-1;i>=0;i--){
		System.out.print(str.charAt(i));
	}
}
}
