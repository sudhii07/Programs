package DSPrograms;

public class Sample8 {
	public static void main(String[] args) {
		int fact=1;
		int arr[] = { 2, 5, 6, 7, 1, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			for(int j=1;j<=arr[i];j++){
				fact=fact*j;
			}
			System.out.println(arr[i]+"->"+fact);
			fact=1;
		}
		
	}

}
