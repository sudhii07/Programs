package DSPrograms;

public class Sample10 {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 7, 1, 3, 4, 10 };
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(arr[i] + "->" + "Its prime no");
			} else {
				System.out.println(arr[i] + "->" + "Its not a prime no");
			}
		}
	}

}
