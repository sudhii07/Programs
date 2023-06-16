package Programs;
import java.util.Scanner;
public class StrongNumber2 {
	static Scanner sc=new Scanner(System.in);
	static void strong(){
		System.out.println("Enter an number");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while(num!=0){
		    int rem=num%10;
		    sum+=factt(rem);
		    num=num/10;
		}
		if(sum==copy)
			System.out.println(copy+" is strong number");
		else 
			System.out.println(copy+" is not strong number");
		
		System.out.println("Do you want to continue");
		System.out.println("1,Yes");
		System.out.println("2,No");
		int res=sc.nextInt();
		switch (res) {
        case 1: strong();
               break;
        case 2: System.out.println("Thank You,visit again");
               break;
		}
	}
	
	static int factt(int x){
		int fact=1;
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		return fact;
	}
		
	public static void main(String[] args) {
		strong();
		
	}
}
