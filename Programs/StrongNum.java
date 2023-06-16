package Programs;

public class StrongNum {
	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0){
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>0;i--){
				fact=fact*i;
			}
			sum+=fact;
			no/=10;
		}
		if(copy==sum){
			System.out.println("its a strong no");
		} else {
			System.out.println("its not a strong no");
		}
	}

}
