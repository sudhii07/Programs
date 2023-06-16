package DSPrograms;

public class Sample7 {
	public static void main(String[] args) {
		int cub=0;
		int arr[] = { 2, 5, 6, 7, 1, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			 cub=arr[i]*arr[i]*arr[i];
			 System.out.println(arr[i]+"->"+cub);
		}
		
	}

}
