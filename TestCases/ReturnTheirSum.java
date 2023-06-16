package TestCases;

public class ReturnTheirSum {
	public static int value(int a, int b) {
		if (a != b) {
			return a + b;
		} else {
			return ((a + b) * 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(value(3, 3));
	}
}
