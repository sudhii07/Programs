package Programs;

public class AmstrongNum {
	public static void main(String[] args) {
		int no=153;
		int sum=0;
		int copy=no;
		while(no!=0){
			int rem=no%10;
			sum+=rem*rem*rem;
			no=no/10;
		}
		if(copy==sum){
			System.out.println("Its amstrong no");
		} else {
			System.out.println("Its not amstrong no");
		}

	}
}
