package DSPrograms;

public class Sample9 {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		int arr[] = { 2, 5, 6, 7, 1, 3, 4 ,10};
		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i];j++){
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
			}
			System.out.println(arr[i]+"->"+fib3);
			 fib1=0;
			 fib2=1;
			 fib3=0;
		}
	}
}
	