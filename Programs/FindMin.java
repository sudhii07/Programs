package Programs;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = { 9, 5, 3, 6, 2, 7, 1, 8 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
