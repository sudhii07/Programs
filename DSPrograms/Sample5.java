package DSPrograms;

public class Sample5 {
	public static void main(String[] args) {
		int sqr=0;
		int arr[] = { 2, 5, 6, 7, 1, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0){
				sqr=arr[i]*arr[i];
				 System.out.println(arr[i]+"->"+sqr);
			}
		}
		
	}

}
