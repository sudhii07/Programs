package hackothan;

public class Mainclass {
	public static void main(String[] args) {
		String s1="Kitten";
		for(int i=0;i<s1.length();i++){
			if(i==0 || i==1 ||i==4 ||i==5 || i==8 || i==9){
				System.out.print(s1.charAt(i));
			}
		}
	}

}
