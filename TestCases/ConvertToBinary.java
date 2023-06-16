
package TestCases;
import java.util.Scanner;
public class ConvertToBinary {
	public static String binary(){
		int c=0;
		String binary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		sc.close();
		if(a>0 && b>0){
			c=a*b;
			binary=Integer.toBinaryString(c);
		} else {
			return "Please enter positive integers";
		}
		return binary;
		
	}
	
	public static void main(String[] args) {
		System.out.println(binary());
		
	}
	

}
