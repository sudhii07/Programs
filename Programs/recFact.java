package Programs;

public class recFact {
	public static void main(String[] args) {
		System.out.println(fact(6));
	}
	public static int fact(int no){
		int fact=1;
			for(int i=no;i>=1;i--){
				fact=fact*i;
			}
			return fact;	
	}

}
