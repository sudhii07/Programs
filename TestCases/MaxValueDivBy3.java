package TestCases;

public class MaxValueDivBy3 {

	public static int max() {
		int max = 0, max2 = 0;
		int arr[] = { -6, -91, 1011, -100, 84, -22, 0, 1, 473 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (max % 3 == 0) {
				max2 = max;
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		System.out.println(max());
	}

}
