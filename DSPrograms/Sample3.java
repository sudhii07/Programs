package DSPrograms;

public class Sample3 {
	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 2, 5, 6, 7, 1, 3, 4 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];

			}
		}
		sum = sum * sum * sum;
		System.out.println(sum);
	}

}
